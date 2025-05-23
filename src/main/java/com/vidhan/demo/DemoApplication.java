package com.vidhan.demo;

import com.vidhan.demo.model.Developer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		Developer dev = ctx.getBean(Developer.class);
		dev.Greeting();
	}
}
