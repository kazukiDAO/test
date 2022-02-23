package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hoge.config.AppConfig;
import hoge2.config.AppConfig2;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiDemoApplication.class, args);
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
//	    FooService fs = context.getBean(FooService.class);
//	    System.out.println("DiDemoApplicationからこんにちは。"+fs);
//	    FooService2 fs2 = context.getBean(FooService2.class);
//	    System.out.println("DiDemoApplicationからこんにちは。"+fs2);
	    context.close();
	}

}
