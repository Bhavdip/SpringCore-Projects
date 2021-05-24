package training.spring.core.autowire.byname;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientTest {

	public static void main(String[] args) throws JsonProcessingException {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig1.xml");
		/**
		 * Request container give access of Employee Bean
		 */
		Employee employee = applicationContext.getBean("employee", Employee.class);
		// Jack son ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		//Converting the Object to PrettyPrinter JSONString
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
	    System.out.println(jsonString);
	    // close the context
		applicationContext.close();
	}

}
