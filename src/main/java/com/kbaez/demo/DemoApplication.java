package com.kbaez.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kbaez.service.IPersonaService;

@SpringBootApplication
public class DemoApplication {

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
