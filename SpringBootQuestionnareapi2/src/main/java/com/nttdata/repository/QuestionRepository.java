package com.nttdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.model.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions,Integer>{

	
}
