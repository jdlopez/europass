package es.jdl.europass.domain;

import java.util.Date;
import java.util.List;

public class Position {
    private String id;
    private String name;
    private Date creationDate;
    private boolean open; // status?-> enum?
    private Date endDate;
    private List<Candidate> candidates;
    private List<Employee> innerCandidates;
}
