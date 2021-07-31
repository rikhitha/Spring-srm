package com.simplecoding.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.entities.ProductJoin ;
import com.demo.JPAConfiguration;
import com.demo.services.ProductService;

@SpringBootApplication
public class cusotm {

	public static void main(String[] args) {
		SpringApplication.run(cusotm.class, args);

		try {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
			ProductService productService = context.getBean(ProductService.class);

			for (ProductJoin productJoin : productService.join()) {
				System.out.println("Id: " + productJoin.getId());
				System.out.println("Name: " + productJoin.getName());
				System.out.println("Price: " + productJoin.getPrice());
				System.out.println("Category Id: " + productJoin.getCategoryId());
				System.out.println("Category Name: " + productJoin.getCategoryName());
				System.out.println("==================");
			}

			context.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
