package taining.spring.core.spel.javaconfig.test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import taining.spring.core.spel.xmlconfig.Car;
import taining.spring.core.spel.xmlconfig.CarOperator;


public class ClientXMLTest {

	public static void main(String[] args) {

		/**
		 * Take Application Context instance
		 * 
		 * This example is Application configuration using XML method hence we use AbstractApplicationContextt
		 */
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		
		/**
		 * Next step will ask Application context container to get the bean reference
		 * and we can start using it.
		 * 
		 */
		Car nwCar = applicationContext.getBean("someCar", Car.class);
		
		System.out.println("[ClientXMLTest::Car]" + nwCar.toString());
		
		/**
		 * Operators in XML Configuration
		 */
		CarOperator carOperator = applicationContext.getBean("spelOperators", CarOperator.class);
		System.out.println("[CarOperator]" + carOperator.toString());
		
		/**
		 * At the end of Program close the context otherwise Resource leak: 'applicationContext' is never closed
		 */
		applicationContext.close();
	}
}
