package training.spring.core.aop.service;

import java.util.List;

import training.spring.core.aop.model.EmployeeDTO;

public interface EmployeeManager {

	public EmployeeDTO getEmployeeById(Integer employeeId);
	 
    public List<EmployeeDTO> getAllEmployee();
 
    public void createEmployee(EmployeeDTO employee);
 
    public void deleteEmployee(Integer employeeId);
 
    public void updateEmployee(EmployeeDTO employee);
}
