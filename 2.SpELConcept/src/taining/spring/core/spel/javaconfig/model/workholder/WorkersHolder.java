package taining.spring.core.spel.javaconfig.model.workholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WorkersHolder {
	
	/**
	 * Workers List
	 */
	private List<String> workers = new ArrayList<String>();
	
	/**
	 * Salary by workers
	 */
	private Map<String, Integer> salaryByWorkers = new HashMap<String, Integer>();

	
	public WorkersHolder() {
		workers.add("Jignesh");
		workers.add("Kaushik");
		workers.add("Rakesh");
		workers.add("Bhargav");
		workers.add("Vimal");
		workers.add("Hardik");
		
		salaryByWorkers.put("Jignesh", 1000);
		salaryByWorkers.put("Kaushik", 4000);
		salaryByWorkers.put("Rakesh", 9000);
		salaryByWorkers.put("Bhargav", 2000);
		salaryByWorkers.put("Vimal", 2000);
		salaryByWorkers.put("Hardik", 3500);
	}


	public List<String> getWorkers() {
		return workers;
	}


	public Map<String, Integer> getSalaryByWorkers() {
		return salaryByWorkers;
	}
	
	
}
