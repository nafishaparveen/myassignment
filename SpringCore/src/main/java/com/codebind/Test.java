package com.codebind;

import org.springframework.beans.factory.BeanFactory;   
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Customer obj=(Customer) context.getBean("obj");
	
	System.out.println(obj);
	}
}
