package es.jdl.europass.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan(basePackages = "es.jdl.europass.service")
@Import({
        EuropassConfig.class,
        SecurityConfig.class
})
public class MainApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApp.class, args);
    }

}
