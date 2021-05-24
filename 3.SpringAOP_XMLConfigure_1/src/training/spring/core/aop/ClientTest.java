package training.spring.core.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.core.aop.service.EmployeeManager;

public class ClientTest {
	
	public static void main(String[] args) {
		
		/**
		 * Take instance of IoC container 
		 */
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfiguration.xml");
		
		/**
		 * Access the Employee Manager and it's service method
		 */
		EmployeeManager employeeManager = applicationContext.getBean("employeeManager", EmployeeManager.class);
		
		// Get Employee By Id
		employeeManager.getEmployeeById(100);
		
		// Get All Employee 
		employeeManager.getAllEmployee();
		
		applicationContext.close();
	}
}
