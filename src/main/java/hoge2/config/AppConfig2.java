package hoge2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hoge2.service.FooService2;
import hoge2.service.impl.FooServiceImpl2;
import hoge2.web.controller.FooController2;

@Configuration
public class AppConfig2 {

	@Bean
	public FooService2 getFooService() {
		return new FooServiceImpl2();
	}

	@Bean
	public FooController2 getFooController(FooService2 fs) {
		return new FooController2(fs);
	}
	
	
}
