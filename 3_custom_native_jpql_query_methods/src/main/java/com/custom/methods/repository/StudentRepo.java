package com.custom.methods.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.custom.methods.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

	//custom finder methods / derived...
	public List<Student> findByName(String name);
	
	public List<Student> findByNameAndId(String name,int id); //predefined pattern expression
	
	public List<Student> findByNameStartingWith(String name);
	
	public List<Student> findByNameEndingWith(String name);
	
	public List<Student> findByNameContaining(String name);
	
	// JPQL queries
	@Query("select  s from Student s")
	public List<Student> getAllUser();
	
	@Query("select s from Student s where s.name=:n")
	public List<Student> getStudentByName(@Param("n") String name);
	
	@Query("select s from Student s where s.name=:n and s.id=:i")
	public List<Student> getStudentByIdName(@Param("n") String name,@Param("i")int id);
	
	
	// Native query/sql query.
	@Query(value="select * from Student where id>10 order by id desc limit 3",nativeQuery = true)
	public List<Student> getStudents();
	
	
}
