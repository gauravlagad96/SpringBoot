package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crud.dao.UserRepository;
import com.crud.entities.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Application.class, args);
	UserRepository ur = ac.getBean(UserRepository.class);
	User user = new User();
	
	user.setName("gaurav");
	user.setMobile(866934);
	
	User user1 =ur.save(user);
	System.out.println(user1);
	
	}
}
