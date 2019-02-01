package es.jdl.europass.service.rest;

import es.jdl.europass.domain.EnumStatus;
import es.jdl.europass.domain.JobApplication;
import es.jdl.europass.domain.Position;
import es.jdl.europass.service.data.JobApplicationRepository;
import es.jdl.europass.service.data.PositionRepository;
import es.jdl.europass.service.exception.NotFoundRestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class JobServiceRest {

    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    @GetMapping("/job/{id}")
    public Position getPositionById(@PathVariable("id") String id) {
        return positionRepository.findById(id).orElse(null);
    }

    @GetMapping("/jobs")
    public List<Position> findAll() {
        return positionRepository.findByOpenToPublicAndStatus(true, EnumStatus.OPEN);
    }

    @PostMapping("/job/{id}/application")
    public String sendApplication(@PathVariable("id") String id, @RequestBody String comments
            /*, @AuthenticationPrincipal JobSystemUser user*/) throws NotFoundRestException {
        Position position = positionRepository.findById(id).orElse(null);
        if (position == null)
            throw new NotFoundRestException("position", id);
        JobApplication application = new JobApplication();
        application.setApplicant(/*user.getJobApplicant()*/null);
        application.setPosition(position);
        application.setAplicantComments(comments);
        application.setSubmitDate(new Date());
        application.setActive(true);
        application = jobApplicationRepository.insert(application);
        return application.getId();
    }

    @PostMapping("/hr/job")
    public Position createPosition(@RequestBody @Valid Position position, HttpServletRequest request) { /*, @AuthenticationPrincipal JobSystemUser user*/
        if (position.getId() == null) {
            position.setCreationDate(new Date());
            position.setCreatedBy(request.getRemoteUser()); // replace by user.something
            position.setStatus(EnumStatus.OPEN);
            position = positionRepository.insert(position);
        } else {
            positionRepository.save(position);
        }
        return position;
    }
}
