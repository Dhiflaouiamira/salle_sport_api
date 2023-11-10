package com.tekup.salle_sport.controller;



import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.salle_sport.services.UserServices;
import com.tekup.salle_sport.model.Role;
import com.tekup.salle_sport.model.User;
import com.tekup.salle_sport.repository.RoleRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

	
	@Autowired
	private UserServices userServices;
	@Autowired
	private RoleRepository roleRepository;
	
	
	@GetMapping
	public List<User> getAllUsers(){
		List<User> List= userServices.getAllUsers();
		return List;
	}
	
	@PostMapping("/{roleId}")
	public ResponseEntity<?> saveUser(@PathVariable(value = "roleId") Long roleId, @RequestBody User user) {
		Optional<Role> role = roleRepository.findById(roleId);
		role.ifPresent(r ->{
			user.setRole(r);
		});
		
		if(userServices.userExist(user.getEmail())) {
			return new ResponseEntity<>("Email already exists", HttpStatus.BAD_REQUEST);
		}
		
		userServices.addUser(user);
		
		return new ResponseEntity<>("User Added successfully", HttpStatus.OK);
	}

      
    @DeleteMapping
    public void deleteUser(@RequestBody User U) {
    	 userServices.deleteUser(U);
    }
}
    
    
    
    
    
    
    
    
    