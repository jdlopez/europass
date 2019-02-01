package es.jdl.europass.service.rest;

import es.jdl.europass.domain.SkillType;
import es.jdl.europass.service.data.SkillTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetadataServiceRest {

    @Autowired
    private SkillTypeRepository skillRepository;

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

}
