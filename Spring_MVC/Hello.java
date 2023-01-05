package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() {	// 인스턴스 메서드 - iv, cv 둘다 사용 가능
		System.out.println("Hello - private");
		System.out.println(cv);	// OK
		System.out.println(iv);	// OK
	}
	
	public static void main2() {
		System.out.println(cv);	// static메서드 - cv만 사용 가능
//		System.out.println(iv);	// ERROR
	}

}
