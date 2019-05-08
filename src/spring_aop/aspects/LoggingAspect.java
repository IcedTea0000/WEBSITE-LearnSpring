package spring_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(* get*(..))")
	public void loggingActivity(){
		System.out.println("logging aspect executed. Logging activity.");
	}
	
	@Before("execution(* get*(..))")
	public void secondActivity(){
		System.out.println("second aspect executed.");
	}
	
/*	
	@Pointcut("execution(* get*(..))")
	public void allGetter(){
	}
*/	
}
