package com.squadro.touricity.message.types;

public class Greeting implements IMessage {
	private final String content;
	private final String joke;

	public Greeting(String content, String joke) {
		this.content = content;
		this.joke = joke;
	}

	public String getContent() {
		return content;
	}

	public String getJoke() {
		return joke;
	}
}
