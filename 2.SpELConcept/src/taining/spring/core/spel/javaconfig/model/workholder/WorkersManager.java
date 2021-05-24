package taining.spring.core.spel.javaconfig.model.workholder;

import org.springframework.beans.factory.annotation.Value;

public class WorkersManager {
	/**
	 * We can access the values of collections using SpEL (Spring Expression Language)
	 * and Spring will auto inject value into the variable for us.
	 */
	
	/**
	 * Find the total workers using SpEL
	 */
	
	@Value("#{workersHolder.workers.size() } ")
	private int totalWorkers;
	
	@Value("#{workersHolder.workers.get(0) }")
	private String firstWorker;
	
	@Value("#{workersHolder.workers.get(5) }")
	private String lastWorker;
	
	@Value("#{workersHolder.salaryByWorkers.get('Jignesh') }")
	private String jigneshSalary;

	@Override
	public String toString() {
		return "WorkersManager [totalWorkers=" + totalWorkers + ", firstWorker=" + firstWorker + ", lastWorker="
				+ lastWorker + ", jigneshSalary=" + jigneshSalary + "]";
	}


	
}
