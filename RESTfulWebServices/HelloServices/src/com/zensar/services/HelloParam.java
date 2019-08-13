package com.zensar.services;

import javax.ws.rs.PathParam;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@Path("/zenparam")
public class HelloParam {
	
	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
	
	public Response getMessage(@PathParam("nm") String name) {
		
		return Response.status(200).entity("<p>Hello<b><i>" + name + "</i></b>Welcome to zensar hello service</p>").build();
	}
	
	@Path("/birthday/{d}/{m}/{y}")
	@GET
	@Produces("text/html")
	public Response getMessage(@PathParam("d") int day,@PathParam("m") int month,@PathParam("y")int year ) {
		
        LocalDate date = LocalDate.of(day, month, year);
		return Response.status(200).entity("<p>Happy Birthday<b><i>" + date +"</i></b></p>").build();
		}
	
	
	
	
	
	
   
	
}

