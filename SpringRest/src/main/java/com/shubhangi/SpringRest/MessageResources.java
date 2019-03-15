package com.shubhangi.SpringRest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shubhangi.SpringRest.model.Message;
import com.shubhangi.SpringRest.service.MessageService;

@Path("/messages")
public class MessageResources 
{
	
	MessageService messagerService = new MessageService() ; 
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessage()
//	{
//		return "Hello World";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON )
	public List<Message> getMessage()
	{
		//to return all messages
		return messagerService.getAllMessages();
	}
//	
//	@GET
//	@Path ("/{messageid}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String test(@PathParam("messageid") String messageID)
//	{
//		
//		//messagerService.getMessage(messageid);
//		return "Got path Param "+messageID;
//	} 
	
	@GET
	@Path ("/{messageid}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageid") long id)
	{
		return	messagerService.getMessage(id);	 
	} 
	
//	@GET
//	@Path ("/{messageid}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Message getMessage(@PathParam("messageid") long id)
//	{
//		return	messagerService.getMessage(id);	 
//	} 
	
	
}
