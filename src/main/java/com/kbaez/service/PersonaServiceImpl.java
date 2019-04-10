package com.kbaez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbaez.respository.IPersona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersona repo;
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
	}

}
