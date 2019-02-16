package es.jdl.europass.service.rest;

import es.jdl.europass.domain.Office;
import es.jdl.europass.domain.SkillType;
import es.jdl.europass.service.data.OfficeRepository;
import es.jdl.europass.service.data.SkillTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@RestController
public class MetadataServiceRest {

    @Autowired
    private SkillTypeRepository skillRepository;
    @Autowired
    private OfficeRepository officeRepository;

    // Skills
    @GetMapping("/skills")
    public List<SkillType> getAllSkills() {
        return skillRepository.findAll();
    }

    @PostMapping("/hr/skill")
    public SkillType save(@RequestBody SkillType skillType) {
        return skillRepository.save(skillType);
    }

    @DeleteMapping("/hr/skill/{id}")
    public void delete(@PathVariable String id) {
        skillRepository.deleteById(id);
    }

    /**
     * Get all ISO Locale languages available. First browser locale then english then the rest
     */
    @GetMapping("/languages")
    public List<String> getAllLanguages(HttpServletRequest request, Locale browserLocale) {
        Locale loc = request.getLocale();
        if (browserLocale != null)
            loc = browserLocale;
        ArrayList<String> ret = new ArrayList<>();
        for (String lang : Locale.getISOLanguages()) {
            Locale l = new Locale(lang);
            if (!l.getDisplayLanguage().equals(loc.getDisplayLanguage())
                    && !l.getDisplayLanguage().equals(Locale.ENGLISH.getDisplayLanguage()))
                ret.add(l.getDisplayLanguage());
        }
        Collections.sort(ret);
        ret.add(0, loc.getDisplayLanguage());
        ret.add(1, Locale.ENGLISH.getDisplayLanguage());
        return ret;
    }

    @GetMapping("/countries")
    public List<String> getAllCountries(HttpServletRequest request, Locale browserLocale) {
        Locale loc = request.getLocale();
        if (browserLocale != null)
            loc = browserLocale;
        ArrayList<String> ret = new ArrayList<>();
        for (String c : Locale.getISOCountries()) {
            Locale country = new Locale("", c);
            if (!country.getDisplayCountry().equals(loc.getDisplayCountry()))
                ret.add(country.getDisplayCountry());
        }
        Collections.sort(ret);
        ret.add(0, loc.getDisplayCountry());
        return ret;
    }

    @GetMapping("/company/countries")
    public List<String> getCompanyCountries() {
        ArrayList<String> ret = new ArrayList<>();
        for (Office o : officeRepository.findAll()) {
            Locale l = new Locale("", o.getCountry());
            if (!ret.contains(l.getDisplayCountry()))
                ret.add(l.getDisplayCountry());
        }
        return ret;
    }

    @GetMapping("/company/country/{country}/cities")
    public List<String> getCompanyCities(@PathVariable String country) {
        ArrayList<String> ret = new ArrayList<>();
        for (Office o : officeRepository.findByCountry(country))
            if (!ret.contains(o.getCity()))
                ret.add(o.getCity());
        return ret;
    }

    @GetMapping("/company/cities")
    public List<String> getCompanyAllCities() {
        ArrayList<String> ret = new ArrayList<>();
        for (Office o : officeRepository.findAll())
            if (!ret.contains(o.getCity()))
                ret.add(o.getCity());
        return ret;
    }

    @PostMapping("/hr/office")
    public Office saveOffice(@RequestBody Office office) {
        return officeRepository.save(office);
    }

    @DeleteMapping("/hr/office/{id}")
    public void deleteOffice(@PathVariable String id) {
        officeRepository.deleteById(id);
    }

    @GetMapping("/hr/offices")
    public List<Office> getOffices() {
        return officeRepository.findAll();
    }
}