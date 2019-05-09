package spring_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
/*
	@Before("execution(* get*(..))")
	public void loggingActivity(JoinPoint joinPoint){
		System.out.println("logging aspect executed.");
		System.out.println(joinPoint.toString());
		
	}
	
	@Before("execution(* get*(..))")
	public void secondActivity(){
		System.out.println("second aspect executed.");
	}
*/	
	@Around("execution(* get*(..))")
	public void aroundAdvice(ProceedingJoinPoint pjd){
		
		try {
			System.out.println("aspect before method executed");
			pjd.proceed();
			System.out.println("aspect after method executed");
	
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("aspect if method thorws exception executed");
			e.printStackTrace();
		}
		System.out.println("final aspect executed");
	}
	
/*	
	@Pointcut("execution(* get*(..))")
	public void allGetter(){
	}
*/	
}
