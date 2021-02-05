package com.abc.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class FunRestController {
	
	public String sayHello() {
		return "Hello Kartheek! Time on server is " + LocalDateTime.now();
	}
}
