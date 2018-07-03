package webApp;
import javax.json.JsonArray;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;  
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;  
@Path("/product")  
public class Hello{  
    @POST  
    @Path("/add")  
    public Response addUser(  
        @FormParam("name") String name,  
        @FormParam("grade") float grade) {  
   
        return Response.status(200)  
            .entity(" Grade added successfuly!<br>"+ "<br> Name: " + name +"<br> Grade: "+ grade)  
            .build();  
    }
    
//	@GET
//    @Path("/database")
//	@Produces(MediaType.TEXT_HTML)
//	public String returnDatabaseStatus() throws Exception {
//		
//		String myString = null;
//		String returnString = null;
//		JsonArray json = new JsonArray();
//		
//		try {
//			
//			Schema308tube dao = new Schema308tube();
//			
//			json = dao.queryCheckDbConnection();
//			myString = json.toString();
//			
//			returnString = "<p>Database Status</p> " +
//				"<p>Database Date/Time return: " + myString + "</p>";
//			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return returnString; 
//	}
}  
