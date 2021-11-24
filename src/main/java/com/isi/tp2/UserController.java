package com.isi.tp2;

import java.util.LinkedList;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserConverter userConv;
	

	@GetMapping(path="/{id}")
	public ResponseEntity<UserDto> get(@PathVariable Long id) {
		User u = this.userRepo.getById(id);
		UserDto dto = userConv.entityToDto(u);
	
	    return new ResponseEntity<UserDto>(dto,dto != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping(path="")
	public ResponseEntity<List<UserDto>> list(){
		List<User> users = this.userRepo.getAll();
		List<UserDto> res = new LinkedList<>();
		for(User u: users) {
			res.add(userConv.entityToDto(u));
		}
		return  new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PostMapping(path="")
	public ResponseEntity<Boolean> add(@RequestBody UserDto dto) {
		User user = userConv.dtoToEntity(dto);
		boolean res = this.userRepo.add(user);
	
		return new ResponseEntity<>(res,res ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Boolean> update(@PathVariable Long id,@RequestBody UserDto dto) {
		boolean res = this.userRepo.update(id, userConv.dtoToEntity(dto));
		return new ResponseEntity<>(res, res ? HttpStatus.OK :HttpStatus.NOT_FOUND);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean>  delete(@PathVariable Long id) {
	
		boolean res = this.userRepo.delete(id);
		return new ResponseEntity<>(res, res ? HttpStatus.OK :HttpStatus.NOT_FOUND);
	}

}
