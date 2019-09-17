package com.santos.repository.implement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoWebApplication;
import com.santos.repository.IPersonaRepo;

@Repository
@Qualifier("persona1")
public class PersonaRepomImpl1 implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);


	@Override
	public void registrar(String nombre) {
		
		LOG.info("Se registro a: " + nombre);
		
	}

}
