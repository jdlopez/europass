package es.jdl.europass.service.data;

import es.jdl.europass.domain.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobApplicationRepository extends MongoRepository<JobApplication, String> {
}
