package training.spring.core.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import training.spring.core.xmlconfig.model.Message;

public class ClientTest {

	public static void main(String[] args) throws JsonProcessingException {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		Message messageModal = applicationContext.getBean("message", Message.class);
		// Jack son ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		//Converting the Object to PrettyPrinter JSONString
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(messageModal);
	    System.out.println(jsonString);
	    // close the context
		applicationContext.close();
	}

}
