package org.reddy.spring;

//sowmya is a good girl,chaitanya is a bad boy///
// sowmya pulimamidi..//
//sravan is a innocent boy :)///
//sowmya reddy//
//hello
//ggooooooo
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) factory.getBean("triangle");
		triangle.draw();

	}

}
