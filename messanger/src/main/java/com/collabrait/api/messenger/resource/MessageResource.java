package com.collabrait.api.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.collabrait.api.messanger.model.message;
import com.collabrait.api.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	public List<message> getMessages() {
		return messageService.getAll();

	}

	// @GET
	// public String getAll() {
	// return "Hello";
	// }
	//

}
