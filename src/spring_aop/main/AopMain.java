package spring_aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop.model.Triangle;
import spring_aop.service.ShapeService;

public class AopMain {

	public static void main(String args[]){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	ShapeService shapeService=(ShapeService)ctx.getBean("service");
	//shapeService.getCircle().setName("testName");
	//System.out.println("circle name is "+shapeService.getCircle().getName());
	Triangle t=shapeService.getTriangle();
	String k=t.getName();
	}
}
