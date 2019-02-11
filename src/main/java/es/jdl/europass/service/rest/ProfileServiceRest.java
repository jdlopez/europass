package es.jdl.europass.service.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ProfileServiceRest {
    
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
