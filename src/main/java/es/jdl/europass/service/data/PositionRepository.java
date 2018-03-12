package es.jdl.europass.service.data;

import es.jdl.europass.domain.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PositionRepository extends MongoRepository<Position, String> {
}
