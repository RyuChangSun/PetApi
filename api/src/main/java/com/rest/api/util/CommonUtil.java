package com.rest.api.util;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonUtil {

	public static String convertStringByModel(Object object)
	{
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	String json = "";
    	try {
			json = objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return json;
	}
	
	public static String convertStringByModel(List<Object> object)
	{
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	String json = "";
    	try {
			json = objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return json;
	}
}
