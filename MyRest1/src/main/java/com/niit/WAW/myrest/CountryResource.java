package com.niit.WAW.myrest;
import java.util.List;

import javax.validation.constraints.Past;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("countries")
public class CountryResource {
countryService cs=new countryService();
@GET
@Produces(MediaType.APPLICATION_JSON)
public List getCountries()
{
	List loc=cs.getAllCountries();
	return loc;
	
}
@GET
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
public country getCountryById(@PathParam("id") int id)
{
	return cs.getCountry(id);
}
@POST
@Produces(MediaType.APPLICATION_JSON)
public country addCountry(country country)
{
	return cs.addCountry(country);
}
@PUT
@Produces(MediaType.APPLICATION_JSON)

	public country UpdateCountry(country country)
	{
	return cs.UpdateCountry(country);
	}
@DELETE
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
public void deleteCountry(@PathParam("id") int id)
{
	cs.deleteCountry(id);
	
}

}
