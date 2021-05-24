package training.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RocketAppConfiguration {
	
	@Bean
	public RocketEngine getRocketEngineBean() {
		return new RocketEngine();
	}
	
	@Bean(name = "spaceXLuncer")
	public RocketLuncher getRocketLuncherBean() {
		return new RocketLuncher();
	}
}
