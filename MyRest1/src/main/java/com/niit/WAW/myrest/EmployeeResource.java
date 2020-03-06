package com.niit.WAW.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("Employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1: return "{'name':'John','age':28}";
				case 2: return "{'name':'peter','age':29}";
				default: return "{'name':'mark','age':29}";
		}
	}

}
