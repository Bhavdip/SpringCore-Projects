package training.spring.core.model;

public class Message {
	public int messageId;
	public String message;
	
	public Message() {
		System.out.println("Constructor has been created by IoC Container");
	}
	
	public int getMessageId() {
		return messageId;
	}
	
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
