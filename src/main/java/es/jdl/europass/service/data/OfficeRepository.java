package es.jdl.europass.service.data;

import es.jdl.europass.domain.Office;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OfficeRepository extends MongoRepository<Office, String> {
    List<Office> findByCountry(String country);
}
