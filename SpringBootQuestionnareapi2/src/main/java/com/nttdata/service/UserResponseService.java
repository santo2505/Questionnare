package com.nttdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.model.Questions;
import com.nttdata.model.Response;
import com.nttdata.model.User;
import com.nttdata.repository.QuestionRepository;
import com.nttdata.repository.UserRepository;
import com.nttdata.repository.UserResponseRepository;


@Service
public class UserResponseService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	UserResponseRepository userResponseRepository;
	
	@Autowired
	UserRepository userRepository;
	
int marks = 0;
	
	
	public int validateResponse(List<Response> response) {
		
		for(Response res: response) {
			Optional<Questions> q = questionRepository.findById(res.getQid());	
			Questions question = q.get();
			if(res.getResponse().equalsIgnoreCase(question.getCorrect())) {
				marks+=10;
			}
			
		}
		

		return marks;	
	}
	
	public void submitResponse(List<Response> response) {
//		
		
		for(Response res: response) {

			
			userResponseRepository.save(res);
			
		}
		

	}
	
	public User fetchUserByUemailaAndPassword(String uemail,String password ){
	
		return userRepository.findByUemailAndPassword(uemail,password);
	}
	
	
	public Integer getMarks() {
		return marks;
	}
}
