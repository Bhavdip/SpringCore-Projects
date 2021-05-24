package training.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("AppConfiguration2.xml");
		Communication communication = abstractApplicationContext.getBean("communication", Communication.class);
		communication.communicate();
		//close the context for avoid resource leak
		abstractApplicationContext.close();
	}
}
