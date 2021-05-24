package training.spring.core.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class EmployeeCRUDLoggingAspect {
	
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDLoggingAspect=>logBefore() : " + joinPoint.getSignature().getName());
	}
	
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDLoggingAspect=>logAfter() : " + joinPoint.getSignature().getName());
	}

}
