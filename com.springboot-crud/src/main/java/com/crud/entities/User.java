package com.crud.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private long mobile;
		
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
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		
		public User(int id, String name, long mobile) {
			super();
			this.id = id;
			this.name = name;
			this.mobile = mobile;
		}
		
		public User() {
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
		}
				
}
