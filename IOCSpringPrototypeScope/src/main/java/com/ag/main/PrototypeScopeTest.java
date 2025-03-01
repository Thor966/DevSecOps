package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.comp.WishMessageGenerator;
import com.ag.config.AppConfig;

public class PrototypeScopeTest {

	public static void main(String[] args) {
		
		// creating  IOC container
		AnnotationConfigApplicationContext aca=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object
		
		WishMessageGenerator generator1 = aca.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = aca.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode()+"  "+ generator2.hashCode());
		System.out.println("generator1==generator2: "+ (generator1==generator2));
		
		
		// closing the IOC container
		aca.close();
		
		

	}

}
