package hoge2.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import hoge2.service.FooService2;

public class FooController2 {

	private FooService2 fs;

	@Autowired //アノテーションはコンストラクタが単一なら省略可能
	public FooController2(FooService2 fs) {
		this.fs = fs;
		System.out.println("FooController2からこんにちは。"+this.fs);
	}
}
