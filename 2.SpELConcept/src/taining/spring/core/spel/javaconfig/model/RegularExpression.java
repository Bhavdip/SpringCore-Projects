package taining.spring.core.spel.javaconfig.model;

import org.springframework.beans.factory.annotation.Value;

public class RegularExpression {

	/**
	 * #{'value' matches 'regex' }
	 *
	 */

	@Value("#{'bhavdip.pathar@gmail.com' matches '/\\S+@\\S+\\.\\S+/' }")
	public boolean isValidEmailAddress;

	
	@Value("#{'invalid alphabetic string #$1' matches '[a-zA-Z\\s]+' }") // false
	private boolean invalidAlphabeticStringResult;

	@Value("#{'200' matches '\\d+' }") // true if someValue contains only digits
	private boolean validNumericValue;

	@Override
	public String toString() {
		return "RegularExpression [isValidEmailAddress=" + isValidEmailAddress + ", invalidAlphabeticStringResult="
				+ invalidAlphabeticStringResult + ", validNumericValue=" + validNumericValue + "]";
	}
	
}
