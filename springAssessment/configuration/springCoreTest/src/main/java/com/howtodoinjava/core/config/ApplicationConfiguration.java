package com.howtodoinjava.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.beans.DemoManagerImpl;

@Configuration
public class ApplicationConfiguration 
{
	
	@Bean(name="demoService")
    public DemoManager helloWorld() 
    {
        return new DemoManagerImpl();
    }

}
