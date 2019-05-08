package spring_aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop.service.ShapeService;

public class AopMain {

	public static void main(String args[]){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	ShapeService shapeService=(ShapeService)ctx.getBean("service");
	shapeService.getCircle().setName("testName");
	//System.out.println(shapeService.getCircle().getName());
	//System.out.println(shapeService.getTriangle().getName());
	
	}
}
