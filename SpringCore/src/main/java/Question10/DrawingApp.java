package Question10;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("config.xml"));
		ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
		Triangle triangle =(Triangle) context1.getBean("triangle");
		triangle.draw();
		
		
		

	}

}
