package traning.spring.core.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ClientTest {

	public static void main(String[] args) throws JsonProcessingException {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		UserInfo universityInfo = applicationContext.getBean("userInfo", UserInfo.class);
		// Jack son ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		//Converting the Object to PrettyPrinter JSONString
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(universityInfo);
	    System.out.println(jsonString);
	    // close the context
		applicationContext.close();
	}

}
