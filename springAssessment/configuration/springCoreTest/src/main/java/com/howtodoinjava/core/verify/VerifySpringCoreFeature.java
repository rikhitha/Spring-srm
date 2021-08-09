package com.howtodoinjava.core.verify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.config.ApplicationConfiguration;

public class VerifySpringCoreFeature 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	    DemoManager  obj = (DemoManager) context.getBean("demoService");
	    System.out.println( obj.getServiceName());
	}
}
