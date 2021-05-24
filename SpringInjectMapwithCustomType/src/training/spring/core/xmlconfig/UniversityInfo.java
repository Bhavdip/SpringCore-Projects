package training.spring.core.xmlconfig;

import java.util.Map;

public class UniversityInfo {
	
	private Map<Integer, Student> studentMap;
	
	public UniversityInfo() {
		System.out.println("[University Info] Constructor has been created!!! [" + this.hashCode() + "]" );
	}

	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}
	
}
