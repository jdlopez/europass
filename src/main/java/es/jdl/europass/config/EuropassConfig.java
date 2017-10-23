package es.jdl.europass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan ("es.jdl.europass.service")
@EnableMongoRepositories("es.jdl.europass.service.data")
@EnableWebMvc
public class EuropassConfig {
}
