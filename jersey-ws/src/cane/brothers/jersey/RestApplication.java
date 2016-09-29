package cane.brothers.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//@ApplicationPath("/") cannot be empty
@ApplicationPath("/rest")
public class RestApplication extends ResourceConfig {
	public RestApplication() {
        packages("cane.brothers.jersey.web");
    }
}
