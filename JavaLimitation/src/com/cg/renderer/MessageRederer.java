package com.cg.renderer;

import com.cg.provider.MessageProvider;

public interface MessageRederer {
	public void render();
	public void setMessageProvider(MessageProvider provider);
}
