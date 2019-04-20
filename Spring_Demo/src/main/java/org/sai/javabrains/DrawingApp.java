package org.sai.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {


		//Triangle triangle = new Triangle();  
		// normal flow
		
		// now using bean factory of XML
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\Suyog\\Software_Development\\Eclipse\\Eclipse_Workspace\\Spring_Demo\\src\\main\\java\\spring.xml"));
		
		//working with application context
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // no need to give path it will use class path
		
		// this is used to shut down application context for desktop applications, web applications spring will shut it off automatically
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		//Triangle triangle = (Triangle) context.getBean("triangle1"); // it gets bean from bean factory and cast it 
		//Circle circle = (Circle) context.getBean("circle");
		
		
		// coding to interface
		
		//Shape shape = (Shape) context.getBean("triangle1");
		//shape.draw();
		
		Shape shape1 = (Shape) context.getBean("circle");
		shape1.draw();
		
		//triangle.draw();
		//circle.draw();

	}

}
