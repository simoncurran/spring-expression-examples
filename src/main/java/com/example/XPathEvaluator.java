package com.example;

import org.springframework.stereotype.Component;

@Component
public class XPathEvaluator {

	public boolean exists(String xpath) {
	    return true;	
	}
	
	public boolean equals(String xpath, String value) {
	    return true;	
	}	
	
	public String value(String xpath) {
	    return "Hello World";	
	}	
}