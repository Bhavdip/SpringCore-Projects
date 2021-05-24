package training.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public ActiveMQMessaging activeMQMessagingBean() {
		return new ActiveMQMessaging();
	}
	
	@Bean(name = "communication")
	public Communication communicationBean() {
		return new Communication(activeMQMessagingBean());
	}
}
