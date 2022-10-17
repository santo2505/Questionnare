package com.nttdata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.Login;
import com.nttdata.model.User;
import com.nttdata.repository.UserRepository;
import com.nttdata.service.UserResponseService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository rp;
	
	@Autowired
	private UserResponseService rs;
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> lstprd=rp.findAll();
		return new ResponseEntity<List<User>>(lstprd,HttpStatus.OK);
	}
	                                                                
 
	
	@PostMapping("/addUser")
	public ResponseEntity<User> saveUser(@RequestBody User p){
		User product=rp.save(p);
		return new ResponseEntity<User>(product,HttpStatus.OK);               
	}
	
	@PostMapping("/login")
	   public ResponseEntity<Login> loginUser(@RequestBody Login ob)
	   {
		   
		  String email=ob.getUemail();
		  String pass=ob.getPassword();
		 User obj=null;
		  if(email!=null && pass!=null)
		  {
			 obj= rs.fetchUserByUemailaAndPassword(email,pass);
		  }
		   if(obj!=null)
		   {
			   return new ResponseEntity<Login>(ob,HttpStatus.OK); 
					   
		   }
		  return new ResponseEntity<Login>(HttpStatus.FORBIDDEN);
	   }
	

}
