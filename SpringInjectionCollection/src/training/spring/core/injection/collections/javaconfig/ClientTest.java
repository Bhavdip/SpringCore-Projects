package training.spring.core.injection.collections.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientTest {

	public static void main(String[] args) throws JsonProcessingException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		OrganizationInfo organizationInfo = applicationContext.getBean("getOrgInfo", OrganizationInfo.class);
		ObjectMapper mapper = new ObjectMapper();
		//Converting the Object to PrettyPrinter JSONString
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(organizationInfo);
	    System.out.println(jsonString);
		applicationContext.close();
	}

}
