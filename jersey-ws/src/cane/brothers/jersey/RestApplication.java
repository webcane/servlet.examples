package cane.brothers.jersey;

//import javax.json.stream.JsonGenerator;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import cane.brothers.jersey.web.HelloResource;

//@ApplicationPath("/") cannot be empty
@ApplicationPath("/rest")
public class RestApplication extends ResourceConfig {
	public RestApplication() {
		//register resources
		register(HelloResource.class);
		
		// enable Jackson JAX-B-JSON providers
		register(JacksonJaxbJsonProvider.class);
    }
}
