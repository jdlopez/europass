package es.jdl.europass.service.data;

import es.jdl.europass.domain.EnumStatus;
import es.jdl.europass.domain.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PositionRepository extends MongoRepository<Position, String> {
    List<Position> findByOpenToPublicAndStatus(boolean openToPublic, EnumStatus status);
}
