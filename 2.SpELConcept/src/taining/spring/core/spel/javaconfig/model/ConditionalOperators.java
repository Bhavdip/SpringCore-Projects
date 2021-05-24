package taining.spring.core.spel.javaconfig.model;

import org.springframework.beans.factory.annotation.Value;

public class ConditionalOperators {
	
	@Value("#{10>4? 'a': 'b'}") // "a"
	private String ternary;
	
	@Value("#{arithmeticOperators.getPowerOf() > 1000? 'PowerOf': 'default'}")
	private String ternary2;

	@Override
	public String toString() {
		return "ConditionalOperators [ternary=" + ternary + ", ternary2=" + ternary2 + "]";
	}
	
}
