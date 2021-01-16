package com.engine.allAboutUsersEngine.beans;

public class Message {

	private String uuid;
	private String message;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [uuid=" + uuid + ", message=" + message + "]";
	}

}
