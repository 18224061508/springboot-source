package com.study.springbootsource;

import com.study.springbootsource.ImportRegistrar.EnableImportConfig;
import com.study.springbootsource.ImportRegistrar.User;
import com.study.springbootsource.importSelect.EnableUserService;
import com.study.springbootsource.importSelect.UserService;
import com.study.springbootsource.importSelect.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableUserService
@EnableImportConfig
public class SpringbootSourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootSourceApplication.class, args);
		System.out.println(context.getBean(UserServiceImpl.class));
		System.out.println(context.getBean(User.class));
	}
}
