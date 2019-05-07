package spring_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LoggingActivity(){
		System.out.println("Logging aspect executed. Logging activity.");
	}
	
}
