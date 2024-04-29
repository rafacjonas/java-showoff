package com.showoff;

public class ShowoffBean {

	private String message;

	public ShowoffBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format(message);
	}

}
