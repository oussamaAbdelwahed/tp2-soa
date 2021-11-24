package com.isi.tp2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


@Component
public class UserRepo {

	private static List<User> users = new LinkedList<>();

	
    static {
		users.add(new User(1L,"ousabdelwahed@gmail.com","oussama","abdelwahed"));
	    users.add(new User(2L,"jawher@gmail.com","jawher","abdelwahed"));
     }
	

	
	public User getById(Long id) {
		for(User us : users) {
			if(us.getId() == id)
				return us;
		}
		return null;
	}
	
	
	public List<User> getAll(){
	   return this.users;
	}
	
	public boolean add(User u) {
		return this.users.add(u);
	}
	
	
	public boolean update(Long id,User u) {
		  User us = this.getById(id);
		  if(us != null) {
			   us.setId(u.getId());
			   us.setEmail(u.getEmail());
			   us.setFirstname(u.getFirstname());
			   us.setLastname(u.getLastname());
			   
			   return true;
		  }
		  return false;
	}
	
	
	public boolean delete(Long id) {
		int index = -1;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId() == id) {
				index  = i;
				break;
			}
		}
		
		if(index != -1) {
		   users.remove(index);
		   return true;
		}
		return false;
	}
}
