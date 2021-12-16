/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5.service;

import com.mycompany.mavenproject5.entity.CabSize;
import java.util.Collection;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author abhishek jariwala
 */

@RegisterRestClient(baseUri = "http://localhost:8081/mavenproject4/rest/example")
public interface cabServe {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<CabSize> getAllcabs();
    
}
