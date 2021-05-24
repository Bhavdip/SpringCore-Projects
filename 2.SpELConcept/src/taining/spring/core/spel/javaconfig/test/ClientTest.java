package taining.spring.core.spel.javaconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import taining.spring.core.spel.javaconfig.SpELAppConfiguration;
import taining.spring.core.spel.javaconfig.model.ArithmeticOperators;
import taining.spring.core.spel.javaconfig.model.ConditionalOperators;
import taining.spring.core.spel.javaconfig.model.RegularExpression;
import taining.spring.core.spel.javaconfig.model.RelationalLogicalOperators;
import taining.spring.core.spel.javaconfig.model.workholder.WorkersManager;

public class ClientTest {

	public static void main(String[] args) {
		
		/**
		 * Take Application Context instance
		 * 
		 * This example is Application configuration using annotation method hence we use AnnotationConfigApplicationContext
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpELAppConfiguration.class);
		
		/**
		 * Next step will ask Application context container to get the bean reference
		 * and we can start using it.
		 * 
		 */
		
		ArithmeticOperators arithmeticOperators = applicationContext.getBean("arithmeticOperators", ArithmeticOperators.class);
		
		System.out.println("[ArithmeticOperators]" + arithmeticOperators.toString());
		
		/**
		 * Relational and Logical Operators
		 */
		RelationalLogicalOperators rlOperators = applicationContext.getBean("relationalLogicalOperators", RelationalLogicalOperators.class);
		System.out.println("[RelationalLogicalOperators]" + rlOperators.toString());
		
		/**
		 * ConditionalOperators
		 */
		ConditionalOperators conOperators =  applicationContext.getBean("conditionalOperators", ConditionalOperators.class);
		System.out.println("[ConditionalOperators]" + conOperators.toString());
		
		/**
		 * Regular Expression using SpEL
		 */
		RegularExpression regularExpression = applicationContext.getBean("regularExpression", RegularExpression.class);
		System.out.println("[RegularExpression]" + regularExpression.toString());
		
		
		/**
		 * List and Map collection access using SpEL 
		 */
		WorkersManager workersManager = applicationContext.getBean("workersManager", WorkersManager.class);
		System.out.println("[RegularExpression]" + workersManager.toString());
		
		/**
		 * At the end of Program close the context otherwise Resource leak: 'applicationContext' is never closed
		 */
		applicationContext.close();
	}

}
