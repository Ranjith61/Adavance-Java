package com.xworkz.maps;

import java.io.Serializable;

	public class PersonDTO implements Serializable{
		
		private int id;
		private String name;
		private String email;
		private long mobile;
		
		public PersonDTO(int id, String name, String email, long mobile) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		
		@Override
		public String toString() {
			return "PersonDTO [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
		}
		
	}
	
