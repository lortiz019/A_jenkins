package adidasRest;
 
import javax.ws.rs.Consumes; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
import javax.ws.rs.core.Response; 

@Path("/holaAdidas") 
@Produces(MediaType.APPLICATION_JSON) 
@Consumes(MediaType.APPLICATION_JSON) 
public class HolaAdidasRest {               

    @GET  
    public Response sayHello() {     
        return Response.ok("Hola Adidas",MediaType.APPLICATION_JSON).build();   
    } 
}