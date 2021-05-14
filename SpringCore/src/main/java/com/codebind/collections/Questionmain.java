package com.codebind.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Questionmain {

	public static void main(String[] args) {
		
		ApplicationContext context3= new ClassPathXmlApplicationContext("com/codebind/collections/collectionconfig.xml");
		
		Questions q=(Questions) context3.getBean("questions");
		
		System.out.println(q);

	}

}
