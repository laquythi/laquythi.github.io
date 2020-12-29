package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringBoot2Application.class, args);

		GirlFriend girlFriend = context.getBean(GirlFriend.class);

		System.out.println("Instance girlFriend : " + girlFriend);
		System.out.println("outfit of girlFriend : " + girlFriend.outfit);
		girlFriend.outfit.wear();
	}

}
