package myPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/mtoyservice")
public class MtoYservice {
	@GET
	@Produces("application/xml")
	public String convertMtoY() {
 
		Double yard;
		Double meter  = 1.00;
		yard = meter*0.9144;
 
		String result = "@Produces(\"application/xml\") Output: \n\nMeter to Yard Converter Output: \n\n" + yard;
		return "<mtoyservice>" + "<meter>" + meter + "</meter>" + "<mtoyoutput>" + result + "</mtoyoutput>" + "</mtoyservice>";
	}
 
	@Path("{m}")
	@GET
	@Produces("application/xml")
	public String convertMtoYfromInput(@PathParam("m") Double m) {
		Double yard;
		Double meter = m;
		yard = meter*0.9144;
 
		String result = "@Produces(\"application/xml\") Output: \n\nMeter to Yard Converter Output: \n\n" + yard;
		return "<mtoyservice>" + "<meter>" + meter + "</meter>" + "<mtoyoutput>" + result + "</mtoyoutput>" + "</mtoyservice>";
	}
}
