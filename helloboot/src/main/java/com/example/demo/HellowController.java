package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rest ��� , html ��ä�� �����ϴ� ��� api ��û�� ���� ������ �ٵ��� Ư���� Ÿ������
// ���ڵ�
public class HellowController {

	@GetMapping("/hello")
	public String Hello(String name) {
		return "Hello" + name;
	}
}
