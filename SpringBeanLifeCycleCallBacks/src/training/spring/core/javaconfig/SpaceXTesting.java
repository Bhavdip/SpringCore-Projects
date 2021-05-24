package training.spring.core.javaconfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpaceXTesting {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(RocketAppConfiguration.class);
		RocketLuncher spaceXLunchPad = applicationContext.getBean("spaceXLuncer", RocketLuncher.class);
		spaceXLunchPad.startLunchRocket();
		spaceXLunchPad.stopLunchPad();
		applicationContext.close();
	}

}
