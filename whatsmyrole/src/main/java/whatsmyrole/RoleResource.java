package whatsmyrole;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("role")
public class RoleResource {
	
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@POST
	public Response whatIsMyRole(final Champion[] champions) {
		
		if (champions.length == 0)
			return Response.status(Response.Status.BAD_REQUEST).build();
		
		Role role = Classifier.classify(champions);
		return Response.ok().entity(role).build();
	}
}
