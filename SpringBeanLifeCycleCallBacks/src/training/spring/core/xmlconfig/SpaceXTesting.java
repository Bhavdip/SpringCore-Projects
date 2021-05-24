package training.spring.core.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpaceXTesting {

	public static void main(String[] args) {
		// Take ApplicationContext IOC Container
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("RocketAppConfiguration.xml");
		RocketLuncher spaceXLunchPad = applicationContext.getBean("spaceXLuncer", RocketLuncher.class);
		spaceXLunchPad.startLunchRocket();
		spaceXLunchPad.stopLunchPad();
		applicationContext.close();
	}

}
