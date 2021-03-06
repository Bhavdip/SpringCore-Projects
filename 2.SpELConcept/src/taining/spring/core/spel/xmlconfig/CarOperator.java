package taining.spring.core.spel.xmlconfig;

public class CarOperator {

	private boolean equal;
    private boolean notEqual;
    private boolean greaterThanOrEqual;
    private boolean and;
    private boolean or;
    private String addString;
    
    
	public boolean isEqual() {
		return equal;
	}
	public void setEqual(boolean equal) {
		this.equal = equal;
	}
	public boolean isNotEqual() {
		return notEqual;
	}
	public void setNotEqual(boolean notEqual) {
		this.notEqual = notEqual;
	}
	public boolean isGreaterThanOrEqual() {
		return greaterThanOrEqual;
	}
	public void setGreaterThanOrEqual(boolean greaterThanOrEqual) {
		this.greaterThanOrEqual = greaterThanOrEqual;
	}
	public boolean isAnd() {
		return and;
	}
	public void setAnd(boolean and) {
		this.and = and;
	}
	public boolean isOr() {
		return or;
	}
	public void setOr(boolean or) {
		this.or = or;
	}
	public String getAddString() {
		return addString;
	}
	public void setAddString(String addString) {
		this.addString = addString;
	}
	@Override
	public String toString() {
		return "CarOperator [equal=" + equal + ", notEqual=" + notEqual + ", greaterThanOrEqual=" + greaterThanOrEqual
				+ ", and=" + and + ", or=" + or + ", addString=" + addString + "]";
	}
    
	
    
}
