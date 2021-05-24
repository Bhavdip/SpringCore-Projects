package training.spring.core.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.core.Employee;

public class BeanScopeClient {

	public static void main(String[] args) {
		/* 
		 * Take ClassPathXmlApplicationContext which is implementations ApplicationContext interface
		 * */
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationMetaData.xml");
		
		
		Employee employee = appContext.getBean("tcsEmployee", Employee.class);

		/*
		 * Print the default value of employee which is define in XML file 
		 * **/
		System.out.println("**************");
		System.out.println("Employee Id::"+ employee.getEmployeeId());
		System.out.println("Employee Name::" + employee.getEmployeeName());
		System.out.println("**************");
		
		/* 
		 * Open XML file and check we have set the default value. 
		 * By default scope of bean is Singleton means single object
		 * will be create at application level.
		 * 
		 * Now we will update the value using setter method
		 * after then we will do a new request to IoC container 
		 * for give us the bean.
		 * 
		 * But by default scope of bean is singleton we will received the last 
		 * update value instead of default that define inside the XML
		 * 
		 * */
		System.out.println("**************");
		System.out.println("Object has been updated....");
		employee.setEmployeeId(1001);
		employee.setEmployeeName("Sanjay Joshi");
		System.out.println("**************");
		

		/*
		 * After update value now we request for Bean to IoC container 
		 * and then print the value of employee
		 * **/
		Employee updatedEmp = appContext.getBean("tcsEmployee", Employee.class);
		System.out.println("**************");
		System.out.println("Updated Employee Id::"+ updatedEmp.getEmployeeId());
		System.out.println("Updated Employee Name::" + updatedEmp.getEmployeeName());
		System.out.println("**************");
	
		
		appContext.close();
	}

}
