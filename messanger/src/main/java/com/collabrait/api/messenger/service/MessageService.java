package com.collabrait.api.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.collabrait.api.messanger.model.message;
import com.collabrait.api.messenger.database.DataBaseClass;

public class MessageService {
	
	
	private Map<Long, message> messages = DataBaseClass.getMessage();
	
	public MessageService() {
		messages.put(1L,  new message(1L, "GET TEST", new Date(04,19,2018), "Max"));
		messages.put(2L, new message(2L, "Get Test 2", new Date(04,20,2018), "Peter"));
		
	}
	
	public List<message> getAll(){
		return new ArrayList<message>(messages.values());
	}
	
	public message getMessage(long id) {
		return messages.get(id);
	}
	
}
