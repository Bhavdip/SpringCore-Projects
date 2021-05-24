package training.spring.core.injection.collections.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientCollectionInject {

	public static void main(String[] args) throws JsonProcessingException {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		OrganizationInfo orgInfo = applicationContext.getBean("orgInfo", OrganizationInfo.class);
		// Take ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		//Converting the Object to PrettyPrinter JSONString
		String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(orgInfo);
	    System.out.println(jsonResult);
	    // close the container
		applicationContext.close();
	}

}
