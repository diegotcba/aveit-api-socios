package ar.org.aveit.svc.rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorldService {
	 
    @GET
    @Produces("text/html")
    public String getMsg() {
        return "<html><body><h1>Hello World WebService is called</h1></body></html>";
    }

   @GET
   @Path("/{param1}/{param2}")
   public Response getMsg(@PathParam("param1") String firstName, @PathParam("param2") String lastName) {

       String output = "Hello Mr. " + firstName + " " + lastName;

       return Response.status(200).entity(output).build();

   }

}
