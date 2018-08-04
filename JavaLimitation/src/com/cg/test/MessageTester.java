package com.cg.test;

import com.cg.factory.MessageFactory;
import com.cg.renderer.MessageRederer;

public class MessageTester {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		MessageRederer mr = MessageFactory.getMessageRenderer();
		mr.render();
	}

}
