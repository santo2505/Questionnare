package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.nttdata.*"})
@EnableJpaRepositories(basePackages={"com.nttdata.*"})
@EntityScan(basePackages = {"com.nttdata.model"})
public class SpringBootQuestionnare {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQuestionnare.class, args);
	}

}
