package hoge.service.impl;

import org.springframework.stereotype.Component;

@Component
public class FooServiceImpl implements hoge.service.FooService {
	
	public FooServiceImpl() {
		System.out.println("FooServiceImplからこんにちは。"+this);
	}
}
