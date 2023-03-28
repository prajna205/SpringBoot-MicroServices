package com.nt.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt; //HAS_A property
	
	public WishMessageGenerator() {
		// TODO Auto-generated constructor stub
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	//b.method
	public String showWishMessage(String user) {
		int hour = ldt.getHour();
		//generate wish message
		if(hour<12)
			return "Good morning "+ user;
		else if(hour<16)
			return "Good afternoon "+ user;
		else if(hour<20)
			return "Good evening "+ user;
		else
			return "Good night "+ user;
	} 
}
