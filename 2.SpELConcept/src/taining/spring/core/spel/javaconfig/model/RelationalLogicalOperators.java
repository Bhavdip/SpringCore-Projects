package taining.spring.core.spel.javaconfig.model;

import org.springframework.beans.factory.annotation.Value;

public class RelationalLogicalOperators {
	
	@Value("#{1 == 1}") // true
	private boolean equal;

	@Value("#{1 eq 1}") // true
	private boolean equalAlphabetic;

	@Value("#{1 != 1}") // false
	private boolean notEqual;

	@Value("#{1 ne 1}") // false
	private boolean notEqualAlphabetic;

	@Value("#{1 < 1}") // false
	private boolean lessThan;

	@Value("#{1 lt 1}") // false
	private boolean lessThanAlphabetic;

	@Value("#{1 <= 1}") // true
	private boolean lessThanOrEqual;

	@Value("#{1 le 1}") // true
	private boolean lessThanOrEqualAlphabetic;

	@Value("#{1 > 1}") // false
	private boolean greaterThan;

	@Value("#{1 gt 1}") // false
	private boolean greaterThanAlphabetic;

	@Value("#{1 >= 1}") // true
	private boolean greaterThanOrEqual;

	@Value("#{1 ge 1}") // true
	private boolean greaterThanOrEqualAlphabetic;
	
	@Value("#{250 > 200 && 200 < 4000}") // true
	private boolean and; 

	@Value("#{250 > 200 and 200 < 4000}") // true
	private boolean andAlphabetic;

	@Value("#{400 > 300 || 150 < 100}") // true
	private boolean or;

	@Value("#{400 > 300 or 150 < 100}") // true
	private boolean orAlphabetic;

	@Value("#{!true}") // false
	private boolean not;

	@Value("#{not true}") // false
	private boolean notAlphabetic;

	@Override
	public String toString() {
		return "RelationalLogicalOperators [equal=" + equal + ", equalAlphabetic=" + equalAlphabetic + ", notEqual="
				+ notEqual + ", notEqualAlphabetic=" + notEqualAlphabetic + ", lessThan=" + lessThan
				+ ", lessThanAlphabetic=" + lessThanAlphabetic + ", lessThanOrEqual=" + lessThanOrEqual
				+ ", lessThanOrEqualAlphabetic=" + lessThanOrEqualAlphabetic + ", greaterThan=" + greaterThan
				+ ", greaterThanAlphabetic=" + greaterThanAlphabetic + ", greaterThanOrEqual=" + greaterThanOrEqual
				+ ", greaterThanOrEqualAlphabetic=" + greaterThanOrEqualAlphabetic + ", and=" + and + ", andAlphabetic="
				+ andAlphabetic + ", or=" + or + ", orAlphabetic=" + orAlphabetic + ", not=" + not + ", notAlphabetic="
				+ notAlphabetic + "]";
	}
	

}
