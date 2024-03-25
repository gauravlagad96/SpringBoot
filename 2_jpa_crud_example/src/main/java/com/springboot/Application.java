package com.springboot;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.dao.UserRepository;
import com.springboot.entities.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		UserRepository userRepository = con.getBean(UserRepository.class);

		/*
		 * //save single user User u1= new User(); u1.setCity("kolgaon");
		 * u1.setName("gaurav"); u1.setStatus("Java devloper");
		 * 
		 * User u=userRepository.save(u1); System.out.println(u);
		 */

		/*
		 * //save multiple user at a time User u1 = new User(); u1.setCity("pune");
		 * u1.setName("Vaibhava"); u1.setStatus("bcs");
		 * 
		 * 
		 * User u2 = new User(); u2.setCity("maubai"); u2.setName("prasad");
		 * u2.setStatus("mern stack");
		 * 
		 * List<User> users = List.of(u1,u2); // create list users using List.of
		 * function. jdk 9>=available Iterable<User>
		 * result=userRepository.saveAll(users); result.forEach(user->{
		 * System.out.println(user); }); System.out.println("done");
		 */

		/*
		 * //update the user and print
		 * 
		 * Optional<User> optional=userRepository.findById(52); User us=optional.get();
		 * System.out.println(us); us.setName("gaurav lagad"); us.setId(100);
		 * userRepository.save(us); System.out.println(us);
		 */

		// how to get/display data
		// Iterable< User> itr=userRepository.findAll();
//		Iterator<User> iterator =itr.iterator();

		/*
		  while (iterator.hasNext()) {
		   User user =iterator.next();
		  System.out.println(user);
		  
		  }
		 */

//		itr.forEach(user->System.out.println(user)); //using lambda function

		// Deleting the user elements
		/*
		 * userRepository.deleteById(102); System.out.println("deleted ! "); // delete
		 * single users.
		 */

		// delte all entities.
		Iterable<User> allUser = userRepository.findAll();
		userRepository.deleteAll(allUser);
		System.out.println("deleted ! ");

	}

}
