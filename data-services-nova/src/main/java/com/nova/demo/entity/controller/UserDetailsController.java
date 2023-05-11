package com.nova.demo.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nova.demo.entity.UserDetails;
import com.nova.demo.entity.controller.repository.UserDetailsRepository;

@RestController
public class UserDetailsController
{
	
@Autowired	
UserDetailsRepository repo;
@GetMapping(value="getDetails")
public List<UserDetails> getDetails()
{
 return repo.findAll();

}
@PostMapping(value="saveuser")
public String saveMe (@RequestBody UserDetails user)
{
repo.save(user);	
return "save sucess";
}
@DeleteMapping(value="getdeleted/{id}")
public String getDeleted(@PathVariable Long id) {
	repo.deleteById(id);
	return "deleted success";
	
}
}
