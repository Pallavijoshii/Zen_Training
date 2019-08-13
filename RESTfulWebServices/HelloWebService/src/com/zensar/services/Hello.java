package com.zensar.services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
 
@Path("/zenHello")
public class Hello {
 
	 	@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String sayPlainHello() {
			return "Hello from Zensar";
		}
}