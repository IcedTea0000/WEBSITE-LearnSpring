package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		CircleImpl circleImpl= (CircleImpl)ctx.getBean("circleImpl");
		
		Circle circle=circleImpl.get(1);
		System.out.println(circle.getName());
	}
}
