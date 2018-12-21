package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;


@RestController
public class Controller {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/createTable", method=RequestMethod.GET)
	public void createTable() {
		try {
			jdbcTemplate.execute("");
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//create table lkjasldjfslaf
	
	@RequestMapping(value="/putData", method=RequestMethod.GET) 
	public void putData(){
		try {
			jdbcTemplate.execute("");
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//insert into lkasjdfaljf values 

}
