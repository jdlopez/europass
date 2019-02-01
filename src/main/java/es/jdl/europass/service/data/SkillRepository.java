package es.jdl.europass.service.data;

import es.jdl.europass.generated.domain.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, String> {
}
