package training.spring.core.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import training.spring.core.Employee;

public class ClientTest2 {

	public static void main(String[] args) {
		//1.Take FileSystemXmlApplicationContext which is implementations ApplicationContext interface
		//In this we have to provide the relative configuration XML file
		AbstractApplicationContext appContext = new FileSystemXmlApplicationContext("src/ApplicationMetaData.xml");
		Employee employee = appContext.getBean("tcsEmployee", Employee.class);
		//2.Print out Employee Bean
		System.out.println("**************");
		System.out.println("Employee Id::"+ employee.getEmployeeId());
		System.out.println("Employee Name::" + employee.getEmployeeName());
		System.out.println("**************");
		appContext.close();

	}
}
