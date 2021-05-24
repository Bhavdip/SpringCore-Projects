package training.spring.core.xmlconfig;

import java.util.List;
import java.util.Set;


public class UniversityInfo {
	public UniversityInfo() {
		System.out.println("[University Info] Constructor has been created!!! [" + this.getClass().hashCode() + "]" );
	}
	private List<Student> studentList;
	private Set<Student> studentSet;
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	
}
