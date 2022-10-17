package com.nttdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.Questions;

import com.nttdata.repository.QuestionRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/")
public class QuestionController {
	
	@Autowired
	private QuestionRepository qr;
	@GetMapping("/questions")
	public ResponseEntity<List<Questions>> getAllQuestions(){
		List<Questions> list=qr.findAll();
		return new ResponseEntity<List<Questions>>(list,HttpStatus.OK);
	}
	
	

}
