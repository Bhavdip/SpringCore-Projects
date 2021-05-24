package taining.spring.core.spel.javaconfig.model;

import org.springframework.beans.factory.annotation.Value;

public class ArithmeticOperators {

	@Value("#{19+ 10}") // 20
	private double added;
	
	@Value("#{'String1' + 'String2' }") // String1 String 2
	private String addString;
	
	@Value("#{20-10}") // 10
	private String subtract;
	
	@Value("#{20*100}") // 2000
	private double multiply;
	
	@Value("#{36 div 2}") // 18, the same as for / operator
	private double divideAlphabetic; 
	
	@Value("#{37 % 10}") // 7
	private double modulo;

	@Value("#{37 mod 10}") // 7, the same as for % operator
	private double moduloAlphabetic; 
	
	@Value("#{2 ^ 9}") // 512
	private double powerOf;

	@Value("#{(2 + 2) * 2 + 9}") // 17
	private double brackets;
	
	

	public double getPowerOf() {
		return powerOf;
	}



	@Override
	public String toString() {
		return "ArithmeticOperators [added=" + added + ", addString=" + addString + ", subtract=" + subtract
				+ ", multiply=" + multiply + ", divideAlphabetic=" + divideAlphabetic + ", modulo=" + modulo
				+ ", moduloAlphabetic=" + moduloAlphabetic + ", powerOf=" + powerOf + ", brackets=" + brackets + "]";
	}
	
	
		
}
