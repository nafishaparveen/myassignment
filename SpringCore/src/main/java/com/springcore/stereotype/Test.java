package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Java java = con.getBean("java",Java.class);
		System.out.println(java);

	}

}
