package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.santos.service.IPersonaService;
import com.santos.service.implement.PersonaServiceImpl;

@SpringBootApplication
@ComponentScan(basePackages = {"com.santos.*"})
public class DemoWebApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);

	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		
		//System.out.println("Hola");
		//LOG.info("Hola springboot");
		//LOG.warn("Error spring");
		
		//service = new PersonaServiceImpl();
		
		service.registrar("Santos");
		
	}
	
}
