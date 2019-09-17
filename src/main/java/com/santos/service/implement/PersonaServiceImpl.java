package com.santos.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.santos.repository.IPersonaRepo;
import com.santos.repository.implement.PersonaRepomImpl1;
import com.santos.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	@Qualifier("persona2")
	private IPersonaRepo repo;

	@Override
	public void registrar(String nombre) {

		repo.registrar(nombre);
		
	}

}
