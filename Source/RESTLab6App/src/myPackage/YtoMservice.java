package myPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

//	http://localhost:8080/RESTLab6App/restlab6app/mtoyservice
@Path("/ytomservice")
public class YtoMservice {
	@GET
	  @Produces("application/json")
	  public Response convertYtoM() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double yard = 1.000;
		Double meter;
		meter = yard*1.09361; 
		jsonObject.put("Yard Value", yard); 
		jsonObject.put("Meter Value", meter);

		String result = "@Produces(\"application/json\") Output: \n\nYard to Meter Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }

	  @Path("{y}")
	  @GET
	  @Produces("application/json")
	  public Response convertYtoMfromInput(@PathParam("y") double y) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		double meter;
		meter = y*1.09361; 
		jsonObject.put("Yard Value", y); 
		jsonObject.put("M Value", meter);

		String result = "@Produces(\"application/json\") Output: \n\nYard to Meter Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}
