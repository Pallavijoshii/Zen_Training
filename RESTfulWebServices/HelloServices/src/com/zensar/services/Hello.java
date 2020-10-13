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
	 	
	 	@Path("/welcome")
	 	@GET
	 	@Produces("text/html")
	 	public String sayHtmlHello() {
	 		return "<body bgcolor='pink'>"+"<p>Welcome to zensar html</p>"+"</body>";
	 	}
	 	
	 	@Path("/welcomexml")
	 	@GET
	 	@Produces(MediaType.TEXT_XML)
	 	public String sayXmlHello() {
	 		return "<?xml version='1.0'?>"+"<messages>"+"<message>hello world from zensar xml</message>"+"</messages>";
	 	}
	 	
}