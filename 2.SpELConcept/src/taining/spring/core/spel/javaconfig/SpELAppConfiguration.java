package taining.spring.core.spel.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import taining.spring.core.spel.javaconfig.model.ArithmeticOperators;
import taining.spring.core.spel.javaconfig.model.ConditionalOperators;
import taining.spring.core.spel.javaconfig.model.RegularExpression;
import taining.spring.core.spel.javaconfig.model.RelationalLogicalOperators;
import taining.spring.core.spel.javaconfig.model.workholder.WorkersHolder;
import taining.spring.core.spel.javaconfig.model.workholder.WorkersManager;

@Configuration
public class SpELAppConfiguration {
	
	@Bean(name = "arithmeticOperators")
	public ArithmeticOperators getArithmeticOperators() {
		return new ArithmeticOperators();
	}	

	@Bean(name = "relationalLogicalOperators")
	public RelationalLogicalOperators getRelationalLogicalOperators() {
		return new RelationalLogicalOperators();
	}
	
	@Bean(name = "conditionalOperators")
	public ConditionalOperators getConditionalOperators() {
		return new ConditionalOperators();
	}
	
	@Bean(name = "regularExpression")
	public RegularExpression getRegularExpression() {
		return new RegularExpression();
	}
	
	@Bean(name = "workersHolder")
	public WorkersHolder getWorkersHolder() {
		return new WorkersHolder();
	}
	
	@Bean(name = "workersManager")
	public WorkersManager getWorkersManager() {
		return new WorkersManager();
	}
}
