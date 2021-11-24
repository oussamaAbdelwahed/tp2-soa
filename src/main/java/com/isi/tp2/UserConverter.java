package com.isi.tp2;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {
     public UserDto entityToDto(User u) {
    	 if(u == null) return null;
    	  UserDto dto = new UserDto();
    	  dto.setId(u.getId()).setFirstname(u.getFirstname()).setLastname(u.getLastname()).setEmail(u.getEmail()).setPassword(u.getPassword());
    	  return dto;
     }
     
     public User dtoToEntity(UserDto dto) {
    	 if(dto == null) return null;
    	 User u = new User();
    	 u.setId(dto.getId()).setFirstname(dto.getFirstname()).setLastname(dto.getLastname()).setEmail(dto.getEmail()).setPassword(dto.getPassword());
    	 return u;
     }
}
