package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rest 방식 , html 통채로 리턴하는 대신 api 요청에 대한 응답을 바디의 특정한 타입으로
// 인코딩
public class HellowController {

	@GetMapping("/hello")
	public String Hello(String name) {
		return "Hello" + name;
	}
}
