package training.spring.core;

public class Employee {

	public int employeeId;
	public String employeeName;

	public Employee() {
		System.out.println("Employee Object has been created!!!");
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
