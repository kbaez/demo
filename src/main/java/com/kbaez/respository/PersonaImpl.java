package com.kbaez.respository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kbaez.demo.DemoApplication;

@Repository
public class PersonaImpl implements IPersona{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("SE REGISTRO A "+ nombre);		
	}
	
}
