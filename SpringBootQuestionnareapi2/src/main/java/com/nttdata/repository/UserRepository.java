package com.nttdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.model.Login;
import com.nttdata.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

//	@Query("Select u from User u where u.uemail=?1 AND u.password=?1")
//	public boolean find();
	
	 public User findByUemailAndPassword(String uemail,String password );
}
