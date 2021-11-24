package com.isi.tp2;


public class User {
	   private Long id,RIB;
	   private String firstname,lastname,email,password;
	   
	   
		public User() {}
	   
	   
	   public User(Long id,String email,String fn,String ln) {
		   this.id = id;
		   this.email = email;
		   this.firstname = fn;
		   this.lastname = ln;
	   }
	   
	   public User(Long RIB,Long id,String fn,String ln,String email,String pwd) {
		   this.id = id;
		   this.RIB = RIB;
		   this.firstname = fn;
		   this.lastname = ln;
		   this.email = email;
		   this.password = pwd;
	   }
	   
	   public long getRIB() {
		   return this.RIB;
	   }
	   
	   public void setRIB(long RIB) {
		   this.RIB = RIB;
	   }
	   
	   
	   
	   public long getId() {
		return id;
	   }

		public User setId(Long id) {
			this.id = id;
			return this;
		}
		
		public String getEmail() {
			return email;
		}
		
		public User setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public String getFirstname() {
			return firstname;
		}

		public User setFirstname(String firstname) {
			this.firstname = firstname;
			return this;
			
		}
		
		public String getLastname() {
			return lastname;
		}
		
		public User setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}


		public String getPassword() {
			return password;
		}


		public User setPassword(String password) {
			this.password = password;
			return this;
		}
		
		
}
