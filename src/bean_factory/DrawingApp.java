package bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// Triangle triangle=new Triangle();
		// triangle.draw();
		// BeanFactory factory=new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		try {
			//Triangle triangle1 = (Triangle) context.getBean("triangle1");
			//triangle1.draw();

			//Triangle triangle2 = (Triangle) context.getBean("triangle2");
			//triangle2.draw();

			Triangle triangle3 = (Triangle) context.getBean("triangle3");
			triangle3.draw();
		} catch (Exception e) {

		}
	}
}
