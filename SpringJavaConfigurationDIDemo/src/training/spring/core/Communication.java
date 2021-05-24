package training.spring.core;

public class Communication {
	
	public ActiveMQMessaging activeMQMessage;
	
	//Constructor Dependency Injection
	public Communication(ActiveMQMessaging activeMQMessaging) {
		System.out.println("[Communication] constructor has been created@" + this.hashCode());
		this.activeMQMessage = activeMQMessaging;
	}
		
//	public Communication() {
//		System.out.println("[Communication] constructor has been created@" + this.hashCode());
//	}
	
//	public void setActiveMQMessaging(ActiveMQMessaging activeMQMessaging) {
//		this.activeMQMessage = activeMQMessaging;
//		System.out.println("Communication==>ActiveMQMessaging has been set successfully");
//	}
	
	public void communicate() {
		activeMQMessage.sendMessage();
	}
	
}
