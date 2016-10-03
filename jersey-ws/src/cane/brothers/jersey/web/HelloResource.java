package cane.brothers.jersey.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cane.brothers.jersey.binding.HelloBinding;

/**
 * Root resource 
 */
@Path("hello")
public class HelloResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloBinding getAgamemnon() {
        return new HelloBinding("Agamemnon", 32);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setHello(HelloBinding hello) {
        System.out.println("hello " + hello);
    }
}
