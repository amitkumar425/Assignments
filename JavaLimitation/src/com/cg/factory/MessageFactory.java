package com.cg.factory;

import java.util.ResourceBundle;

import com.cg.provider.MessageProvider;
import com.cg.renderer.MessageRederer;

public class MessageFactory {
	public static MessageRederer getMessageRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ResourceBundle bundle = ResourceBundle.getBundle("Context");
		
		String providerStr = bundle.getString("provider");
		MessageProvider provider =(MessageProvider) Class.forName(providerStr).newInstance();
		
		String rendererStr = bundle.getString("renderer");
		MessageRederer renderer = (MessageRederer)Class.forName(rendererStr).newInstance();
		
		renderer.setMessageProvider(provider);
		return renderer;
	}
}
