package com.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("Setter.xml");
		Student student=(Student)ap.getBean("s");
		student.getMessage("The city is");

	}

}
