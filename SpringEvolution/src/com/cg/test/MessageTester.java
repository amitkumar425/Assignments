package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.renderer.MessageRederer;

public class MessageTester {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		MessageRederer renderer = (MessageRederer) context.getBean("renderer");
		renderer.render();
	}

}
