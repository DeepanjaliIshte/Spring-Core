package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("samosa")
public class Samosa {
	
	public void display()
	{
		System.out.println("my price is little be high....!");
	}

}
