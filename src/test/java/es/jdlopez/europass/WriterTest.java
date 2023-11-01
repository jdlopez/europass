package es.jdlopez.europass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.jdlopez.europass.domain.Award;
import es.jdlopez.europass.domain.Basics;
import es.jdlopez.europass.domain.Certificate;
import es.jdlopez.europass.domain.Education;
import es.jdlopez.europass.domain.Interest;
import es.jdlopez.europass.domain.Language;
import es.jdlopez.europass.domain.Meta;
import es.jdlopez.europass.domain.Project;
import es.jdlopez.europass.domain.Publication;
import es.jdlopez.europass.domain.Reference;
import es.jdlopez.europass.domain.Resume;
import es.jdlopez.europass.domain.Skill;
import es.jdlopez.europass.domain.Volunteer;
import es.jdlopez.europass.domain.Work;
import org.junit.jupiter.api.Test;

public class WriterTest {
    @Test
    public void testWrite() throws JsonProcessingException {
        Resume resume = new Resume();
        resume.setBasics(new Basics());
        resume.getAwards().add(new Award());
        resume.getCertificates().add(new Certificate());
        resume.getLanguages().add(new Language());
        resume.getInterests().add(new Interest());
        resume.getEducation().add(new Education());
        resume.getPublications().add(new Publication());
        resume.getReferences().add(new Reference());
        resume.getProjects().add(new Project());
        resume.getSkills().add(new Skill());
        resume.getVolunteer().add(new Volunteer());
        resume.getWork().add(new Work());
        resume.setMeta(new Meta());
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(

        objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resume)
        );
    }
}
