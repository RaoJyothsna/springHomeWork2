package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootExample {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootExample.class, args);
		DataSource dataSource = context.getBean(DataSource.class);

		System.out.println("---------------------------");
		Resource resourceDev = new ClassPathResource("application-dev.properties");
		Resource resourceTesting = new ClassPathResource("application-testing.properties");
		Resource resourceProd = new ClassPathResource("application-prod.properties");
		System.out.println(resourceDev.exists() && resourceTesting.exists() && resourceProd.exists());
		System.out.println("-------------------------------");

		System.out.println("---------------------");
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(
				Arrays.stream(context.getBeanDefinitionNames())
						.collect(Collectors.toList())
						.contains("myService")
		);
		System.out.println("----------------------------------");
	}

}
