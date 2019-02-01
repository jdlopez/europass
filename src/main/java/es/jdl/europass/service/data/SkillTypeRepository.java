package es.jdl.europass.service.data;

import es.jdl.europass.domain.SkillType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillTypeRepository extends MongoRepository<SkillType, String> {
}
