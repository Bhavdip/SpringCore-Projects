package training.spring.core.aop.service;

import java.util.ArrayList;
import java.util.List;

import training.spring.core.aop.model.EmployeeDTO;

public class EmployeeManagerImpl implements EmployeeManager {

	@Override
	public EmployeeDTO getEmployeeById(Integer employeeId) {
		System.out.println("Method getEmployeeById() called");
		return new EmployeeDTO();
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		System.out.println("Method getAllEmployee() called");
		return new ArrayList<EmployeeDTO>();
	}

	@Override
	public void createEmployee(EmployeeDTO employee) {
		System.out.println("Method createEmployee() called");
		
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		System.out.println("Method deleteEmployee() called");
	}

	@Override
	public void updateEmployee(EmployeeDTO employee) {
		System.out.println("Method updateEmployee() called");
	}

}
