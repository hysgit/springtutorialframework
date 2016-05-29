package com.woslx.spring;

import com.woslx.spring.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("development")
public class SpringConfigDev {

  @Bean
  public Person person(){
	  
	  Person person =  new Person();
	  person.setId(1);
	  person.setName("dev-person");
	  
	  return person;
  }
}