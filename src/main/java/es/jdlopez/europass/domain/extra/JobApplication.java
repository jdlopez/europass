package es.jdlopez.europass.domain.extra;

import lombok.Data;

import java.net.URL;

@Data
public class JobApplication {
    private String jobTitle;
    private String aboutMe;
    private URL jobPublication;
}
