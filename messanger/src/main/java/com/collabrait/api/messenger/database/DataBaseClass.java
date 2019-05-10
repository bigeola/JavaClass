package com.collabrait.api.messenger.database;

import java.util.HashMap;
import java.util.Map;


import com.collabrait.api.messanger.model.message;


public class DataBaseClass {
	private static Map<Long, message> messages = new HashMap<>();
	
	public static Map<Long, message> getMessage(){
		return messages;
	}
//	private static Map<String, profile> profile = new HashMap<>();
//	
//	public static Map<String, profile> getProfiles(){
//		return profile;
//	}
	
}
