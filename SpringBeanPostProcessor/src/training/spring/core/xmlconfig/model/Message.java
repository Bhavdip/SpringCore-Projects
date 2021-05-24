package training.spring.core.xmlconfig.model;

public class Message {
	
	private int messageId;
	private String message;
	
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
	
	public void beanInitialization() {
		System.out.println("[Message] Bean is being Initialization...");
	}
	
	public void beanDestory() {
		System.out.println("[Message] Bean is about to destroy...");
	}
	

}
