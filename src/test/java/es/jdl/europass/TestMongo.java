package es.jdl.europass;

import es.jdl.europass.config.EuropassConfig;
import org.junit.Test;

public class TestMongo {

    @Test
    public void testConnection() {
        EuropassConfig cfg = new EuropassConfig();
        cfg.init();
        System.out.println("mongocli: " + cfg.mongoClient());
        for (String n: cfg.mongoClient().listDatabaseNames())
            System.out.println(n);
    }
}
