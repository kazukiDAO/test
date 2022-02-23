package hoge.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hoge.service.FooService;

@Component
public class FooController {

	private FooService fs;

	@Autowired //アノテーションはコンストラクタが単一なら省略可能
	public FooController(FooService fs) {
		this.fs = fs;
		System.out.println("FooControllerからこんにちは。"+this.fs);
	}
}
