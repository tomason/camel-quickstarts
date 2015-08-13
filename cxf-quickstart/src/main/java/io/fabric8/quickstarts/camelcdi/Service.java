package io.fabric8.quickstarts.camelcdi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/srv/")
public class Service {

	@POST
	@Path("/greet")
	@Consumes("application/json")
	public Response greet(Person person) {
		return null;
	}
}
