package training.spring.core.aop.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.core.aop.model.EmployeeDTO;
import training.spring.core.aop.service.EmployeeManager;

public class ClientTest {

	public static void main(String[] args) {
		/**
		 * Take instance of IoC Context
		 */
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfiguration.xml");
		
		/**
		 * Request for EmployeeManager object to IoC container
		 */
	 	EmployeeManager employeeManager = applicationContext.getBean("employeeManager", EmployeeManager.class);
	 	
	 	employeeManager.createEmployee(new EmployeeDTO());
	 	
	 	employeeManager.getAllEmployee();
		
		applicationContext.close();
	}

}
