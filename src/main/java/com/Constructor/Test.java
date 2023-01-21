package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("Constructor.xml");
		Student student=(Student)ap.getBean("s");
		System.out.println(student);


	}

}
