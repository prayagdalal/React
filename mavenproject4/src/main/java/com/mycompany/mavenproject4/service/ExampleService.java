package com.mycompany.mavenproject4.service;

import com.mycompany.mavenproject4.entity.CabSize;
import com.mycompany.mavenproject4.model.cabService;
import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleService {

    @Inject cabService cs;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<CabSize> get() {
        return cs.getAllcabs();
    }

}
