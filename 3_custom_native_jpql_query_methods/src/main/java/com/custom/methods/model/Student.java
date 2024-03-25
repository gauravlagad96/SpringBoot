package com.custom.methods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	public int id;
	public String name;
	public String standard;
	
   	public Student() {
   		
   	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
   	
   	
}
