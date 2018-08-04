package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class PDFRenderer implements MessageRederer {

	private MessageProvider provider;

	@Override
	public void render() {
		System.out.println(provider.getMessage()+" On PDF :-D");
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}


}
