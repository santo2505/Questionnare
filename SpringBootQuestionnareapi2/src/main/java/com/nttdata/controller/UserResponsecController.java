package com.nttdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.Response;
import com.nttdata.model.User;
import com.nttdata.repository.UserResponseRepository;
import com.nttdata.service.UserResponseService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/")
public class UserResponsecController {

//	@Autowired
//	private UserResponseRepository ur;
//	@PostMapping("/addResponses")
//	public ResponseEntity<Response> saveResponse(@RequestBody Response p){
//		Response res=ur.save(p);
//		return new ResponseEntity<Response>(res,HttpStatus.OK);
//	}
	
	@Autowired
	private UserResponseService ur;
	//private UserResponseRepository ur;
	@PostMapping(value="/submit",consumes={"application/json"})
	public Integer submitResponse(@RequestBody List<Response> response) {
		ur.submitResponse(response);
		return ur.validateResponse(response);
	
		
	}
	
//	@PostMapping(value="/submit",consumes={"application/json"})
//	public ResponseEntity<Response> saveUser(@RequestBody List<Response> response){
//		List<Response> res=ur.save(response);
//		return new ResponseEntity<Response>((Response) res,HttpStatus.OK);
//	}
}
