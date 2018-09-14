package com.study.springbootsource;

import com.study.springbootsource.importSelect.EnableUserService;
import com.study.springbootsource.importSelect.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootSourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootSourceApplication.class, args);
		System.out.println(context.getBean(UserServiceImpl.class));
	}
}
