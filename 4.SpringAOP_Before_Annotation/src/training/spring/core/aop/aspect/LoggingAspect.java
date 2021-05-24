package training.spring.core.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* training.spring.core.aop.service.EmployeeManagerImpl.*(..))")
	public void logginBeforeAllMethod(JoinPoint joinPoint) {
		System.out.println("[LogginAspect.logginBeforeAllMethod()]" + joinPoint.getSignature().getName());
	}
	
	@Before("execution(* training.spring.core.aop.service.EmployeeManagerImpl.getEmployeeById(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint) 
    {
        System.out.println("[LoggingAspect.logBeforeGetEmployee()]" + joinPoint.getSignature().getName());
    }
	
	@Before("execution(* training.spring.core.aop.service.EmployeeManagerImpl.createEmployee(..))")
	public void logBeforeCreateEmployee(JoinPoint joinPoint) 
	{
		System.out.println("[LoggingAspect.logBeforeCreateEmployee()]" + joinPoint.getSignature().getName());
	}
}
