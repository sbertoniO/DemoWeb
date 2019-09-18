package com.santos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santos.repo.IpersonaRepo;
import com.santos.model.Persona;

@RestController
@RequestMapping("personas")
public class RestDemoController {
	
	@Autowired
	private IpersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public String insertar(@RequestBody Persona per){
		repo.save(per);
		return "ok";
	}
	
	@PutMapping
	public String modificar(@RequestBody Persona per){
		repo.save(per);
		return "ok";
	}
	
	@DeleteMapping(value = "/{id}")
	public String eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
		return "ok";
	}

}
