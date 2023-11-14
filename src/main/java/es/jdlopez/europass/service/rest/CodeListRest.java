package es.jdlopez.europass.service.rest;

import es.jdlopez.opendata.domain.CodeList;
import es.jdlopez.opendata.domain.Country;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

public class CodeListRest {

    @GET
    @Path("/lists/country")
    public CodeList<Country> getAllCountries() {
        return null;
    }
}
