package com.swagger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.swagger.app")
public class Application {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
