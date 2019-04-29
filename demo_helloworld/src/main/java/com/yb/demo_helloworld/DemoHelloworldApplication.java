package com.yb.demo_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloworldApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

}
