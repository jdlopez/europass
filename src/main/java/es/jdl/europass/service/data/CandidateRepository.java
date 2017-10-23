package es.jdl.europass.service.data;

import es.jdl.europass.domain.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Access to Candidate list
 * @see es.jdl.europass.domain.Candidate
 */
public interface CandidateRepository extends MongoRepository<Candidate, String> {

}
