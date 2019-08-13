package com.zensar.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")

public class FileDownloadedServices {

	private static final String FILE_PATH="d:/hello.txt";
	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getFile() {
		File file = new File(FILE_PATH);
		ResponseBuilder responseBuilder=Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment; filename=hello_file.txt");
		return responseBuilder.build();
	}
	
	@GET
	@Path("/img")
	@Produces("image/jpg")
	public Response getImage() {
		File file = new File("d:/image.jpg");
		ResponseBuilder responseBuilder=Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment; filename=image.jpg");
		return responseBuilder.build();
	}
}
