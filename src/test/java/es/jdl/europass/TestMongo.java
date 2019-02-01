package es.jdl.europass;

import es.jdl.europass.config.EuropassConfig;
import org.junit.Test;

public class TestMongo {

    @Test
    public void testConnection() {
        EuropassConfig cfg = new EuropassConfig();
        cfg.init();
        System.out.println("mongocli: " + cfg.mongoClient());
        for (String s: cfg.mongoClient().getDatabase("europass").listCollectionNames())
            System.out.printf(s);
    }
}
