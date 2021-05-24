package training.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import training.spring.core.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		// 1.Configuration MetaData
		Resource resource = new ClassPathResource("Beans.xml");
		
		// 2.Spring IOC Container
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		//3.IoC will help to create an instance/object of Message class.
		Message message = beanFactory.getBean("message", Message.class);
//		
//		System.out.println("");
//		System.out.println("A.Access Bean using getBean By Id....");
//		System.out.println("------------------------------------");
//		System.out.println("Message id is::"+ message.getMessageId()+ "and message::" + message.getMessage());
//		
//		System.out.println("");
//		System.out.println("B.Access Bean using getBean By class type....");
//		System.out.println("------------------------------------");
//		Message message1 = beanFactory.getBean(Message.class);
//		System.out.println("Message id is::"+ message1.getMessageId()+ "and message::" + message1.getMessage());
//		
//		System.out.println("");
//		System.out.println("C.If we know the bean we can find the class name or type");
//		System.out.println("------------------------------------");
//		Class<?> classType = beanFactory.getType("message");
//		System.out.println(classType.getName());
//		
//		/* Element : alias
//		 * Defines an alias for a bean (which can reside in a different definition resource).
//		 * <alias name="message" alias="msg"/>
//		*/
//		// this will return string array of alias
//		String[] aliasMsg = beanFactory.getAliases("message");
//		System.out.println("");
//		System.out.println("D.Message object alias name");
//		System.out.println("------------------------------------");
//		for(String name: aliasMsg) {
//			System.out.println(name);
//		}
//		System.out.println("");
//		System.out.println("D.If you know the Bean name you can find is bean Singleton?");
//		System.out.println("------------------------------------");
//		boolean result = beanFactory.isSingleton("message");
//		System.out.print(result);
		
	}
}