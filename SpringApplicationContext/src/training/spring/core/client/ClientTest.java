package training.spring.core.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.core.Employee;

public class ClientTest {

	public static void main(String[] args) {
		//1.Take ClassPathXmlApplicationContext which is implementations ApplicationContext interface
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationMetaData.xml");
		Employee employee = appContext.getBean("tcsEmployee", Employee.class);
		//2.Print out Employee Bean
		System.out.println("**************");
		System.out.println("Employee Id::"+ employee.getEmployeeId());
		System.out.println("Employee Name::" + employee.getEmployeeName());
		System.out.println("**************");
		appContext.close();
	}

}
