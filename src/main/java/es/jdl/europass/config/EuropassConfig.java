package es.jdl.europass.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan ("es.jdl.europass.service")
@EnableMongoRepositories("es.jdl.europass.service.data")
@EnableWebMvc
public class EuropassConfig extends AbstractMongoConfiguration {

    private MongoClientURI clientURI;

    @PostConstruct
    protected void init() {
        // heroku config
        clientURI = new MongoClientURI(System.getenv("MONGODB_URI"));
    }

    @Override
    public MongoClient mongoClient() {
        MongoClient client = new MongoClient(clientURI);
        clientURI.getDatabase();
        return client;
    }

    @Override
    protected String getDatabaseName() {
        return clientURI.getDatabase();
    }
}
