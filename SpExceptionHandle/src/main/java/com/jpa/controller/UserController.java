package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.ExceptionPack.ResourceNotFoundException;
import com.jpa.Model.UserNew;
import com.jpa.Repo.UserRepo;

@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired 
private UserRepo urepo;


//get All Users
@GetMapping
public List<UserNew> getAllUsers(){
	return this.urepo.findAll();
}

//Get Users By Id
@GetMapping("/{id}")

public UserNew getUserById(@PathVariable(value="id") long userId) {
	return this.urepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not Found with id : "+ userId));
}


//Create User

@PostMapping
public UserNew CreateUser(@RequestBody UserNew user) {
return this.urepo.save(user);	
}

//Update User
@PutMapping("/{id}")
public UserNew updateUser(@RequestBody UserNew user,@PathVariable(value="id") long userId ) {
	UserNew existingUser=this.urepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not Found with id : "+ userId));
	existingUser.setFirst_name(user.getFirst_name());
	existingUser.setLast_name(user.getLast_name());
	existingUser.setEmail(user.getEmail());
	
	return this.urepo.save(existingUser);	
}

//Delete user by id
@DeleteMapping("/{id}")

public ResponseEntity <UserNew> deleteUser(@PathVariable(value="id") long userId){
	UserNew existingUser=this.urepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not Found with id : "+ userId));	
this.urepo.delete(existingUser);
return ResponseEntity.ok().build();
}

}

