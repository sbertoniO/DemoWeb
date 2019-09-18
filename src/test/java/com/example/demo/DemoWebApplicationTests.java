package com.example.demo;

import static org.junit.Assert.assertTrue;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.santos.DemoWebApplication;
import com.santos.model.User;
import com.santos.repo.IUserRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationTests {

	private static Logger LOG = LoggerFactory.getLogger(DemoWebApplicationTests.class);
	
	@Autowired
	private IUserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		User us = new User();
		us.setId(1);
		us.setNombre("Santos");
		us.setClave(encoder.encode("123"));
		User retorno = repo.save(us);
		
		LOG.debug(us.getClave());
		LOG.debug(retorno.getClave());
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
