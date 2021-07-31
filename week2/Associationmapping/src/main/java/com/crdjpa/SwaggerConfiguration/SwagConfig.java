package com.crdjpa.SwaggerConfiguration;

import java.util.Collections;

import javax.print.Doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwagConfig 
{
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("com.crdjpa"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
            "Books Api service",
            "store,detele,update,book details,", 
            "Version 11.1.1",
            "Terms & conditions",
            new Contact("xyz","www.books.com","contact@xyz.com"),
            "License of API",
            "Api Licene url",
            Collections.emptyList());
        
    }
    
}
