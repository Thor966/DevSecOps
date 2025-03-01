package com.ag.comp;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator 
{
	@Autowired
	private LocalTime lt ;
	
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator: 0-parm constructor...");
	}
	
	// business method
	
	public String getMessage(String msg)
	{
		int hour = lt.getHour();
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<18)
			return "Good Night";
		else 
			return "Good Night";
	}
	
	

}
