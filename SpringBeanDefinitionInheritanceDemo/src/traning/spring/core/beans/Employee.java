package traning.spring.core.beans;

public class Employee {
	public Integer employeeId;
	public String name;
	public String address;
	public String departmentName;
	public String gender;
	public String dnaPattern;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String fullName) {
		this.name = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDnaPattern() {
		return dnaPattern;
	}
	public void setDnaPattern(String dnaPattern) {
		this.dnaPattern = dnaPattern;
	}
	
}
