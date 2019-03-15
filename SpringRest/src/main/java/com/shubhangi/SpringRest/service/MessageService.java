package com.shubhangi.SpringRest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shubhangi.SpringRest.database.DatabaseClass;
import com.shubhangi.SpringRest.model.Message;

public class MessageService
{
//	public List<Message> getAllMessages()
//	{
//		Message m1=new Message(1, "hello","Shubhangi");
//		Message m2=new Message(2, "hello","Simmy");
//		Message m3=new Message(3 , "hello","Thiru");
//		
//		List<Message> list = new ArrayList();
//		list.add(m1);
//		list.add(m2);
//		list.add(m3);
//		
//		return list;
//		
//	}
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L,new Message(1,"Hello World","Shubhangi"));
		messages.put(2L,new Message(1,"Hello Universe","Simmy"));
	}
	
	
	public List< Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());	
	}
	
	public Message getMessage(Long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()*1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		return null;
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}
