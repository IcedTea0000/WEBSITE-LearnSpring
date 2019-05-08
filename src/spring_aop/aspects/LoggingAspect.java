package spring_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(* get*(..))")
	public void loggingActivity(JoinPoint joinPoint){
		System.out.println("logging aspect executed.");
		System.out.println(joinPoint.toString());
		
	}
	
	@AfterReturning("args(name)")
	public void stringArgumentMethods(String name){
		System.out.println("method takes String argument is called successfully, name is "+name);
	}
	
	@AfterThrowing("args(name)")
	public void stringArgumentMethods2(String name){
		System.out.println("method throws exception");
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
