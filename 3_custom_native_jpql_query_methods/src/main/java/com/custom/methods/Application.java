package com.custom.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.custom.methods.model.Student;
import com.custom.methods.repository.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ApplicationContext con = SpringApplication.run(Application.class, args);
		 StudentRepo studentRepo = con.getBean(StudentRepo.class);		 
		 
		 /*
		 Student s =new Student();
		 s.setId(48);
		 s.setName("Gaurav Lagad");
		 s.setStandard("Mca");
		 
		 Student s1 = studentRepo.save(s);
		 System.out.println("data inserted");
		 System.out.println(s1);
		 */
		 
		 //save multiple users
		 
		 /*
		 Student s =new Student();
		 s.setId(10);
		 s.setName("ram shide");
		 s.setStandard("bba");
		 
		 Student s2 =new Student();
		 s2.setId(11);
		 s2.setName("avi Lagad");
		 s2.setStandard("bcs");
		 
		 List<Student> students= new ArrayList<Student>();
		 students.add(s);
		 students.add(s2);
		 
		 List<Student> student = studentRepo.saveAll(students);
		 System.out.println("Insertd multiple students !");
		 
		 */
		 
		 // display multiple records
		  /*
		  Iterable<Student> itr = studentRepo.findAll();
		Iterator<Student> iterator =itr.iterator();

		    while(iterator.hasNext()) {
			  Student st = iterator.next();
			  System.out.println(st);
		  }
		  
		  */
		 
		 /*// custom methods.
		 List<Student> students = studentRepo.findByName("Gaurav Lagad");
		 students.forEach(e->System.out.println(e));
		 System.out.println("________________________________________________");

		 List<Student> students1 = studentRepo.findByNameAndId("avi Lagad",11);
		 students1.forEach(e->System.out.println(e));
		 System.out.println("________________________________________________");
		 
		 List<Student> students2 = studentRepo.findByNameStartingWith("a");
		 students2.forEach(e->System.out.println(e));
		 System.out.println("_________________________________________________");

		 List<Student> students3 = studentRepo.findByNameContaining("Lagad");
		 students3.forEach(e->System.out.println(e));
		 System.out.println("__________________________________________________");
		 
		 */
		 
		 //JPQL QUERY
		 List<Student> result = studentRepo.getAllUser();
		 result.forEach(e->{
			 System.out.println(e);
		 });
		 
		 System.out.println("__________________________________________________");
        List<Student> results = studentRepo.getStudentByName("Gaurav Lagad");
        results.forEach(e->{
        	System.out.println(e);
        });
		 
        System.out.println("__________________________________________________");
        List<Student> res = studentRepo.getStudentByIdName("avi Lagad",11);
        res.forEach(e->{
        	System.out.println(e);
        });
        
        System.out.println("__________________________________________________");
        System.out.println("__________________________________________________");
        System.out.println("__________________________________________________");
        
        //Native queries
        List<Student> result3 = studentRepo.getStudents();
        result3.forEach(e->{
        	System.out.println(e);
        });
        
		 
		 
	}

}
