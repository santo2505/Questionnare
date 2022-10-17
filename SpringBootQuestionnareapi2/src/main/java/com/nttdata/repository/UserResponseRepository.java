package com.nttdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.model.Response;

@Repository
public interface UserResponseRepository extends JpaRepository<Response,Integer>{



}
