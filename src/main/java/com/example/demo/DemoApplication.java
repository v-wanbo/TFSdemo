package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	 // 2019/02/07
	public static void main(String[] args) { 
		int i=5*5*5*5*5;
		System.out.println("输出：\n \n \n \n);
		System.out.println("2019 / 05 /08 正在测试Build ------------------------- 等 = "+i); 
		SpringApplication.run(DemoApplication.class, args); 
	}

}
