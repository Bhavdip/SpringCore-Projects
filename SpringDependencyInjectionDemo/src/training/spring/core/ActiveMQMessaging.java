package training.spring.core;

public class ActiveMQMessaging {
	
	public ActiveMQMessaging() {
		System.out.println("[ActiveMQMessaging] constructor has been created@" + this.hashCode());
	}
	
	public void sendMessage() {
		System.out.println("Message has been sent...");
	}
}
