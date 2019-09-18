package com.santos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.santos.model.Persona;
import com.santos.repo.IpersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IpersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,@RequestParam(name="id", required=false, defaultValue="1") Integer id, Model model) {
		//logic
		Persona p = new Persona();
		p.setIdPersona(id);
		p.setNombre(name);
		repo.save(p);
		
		model.addAttribute("name",name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String listar(String name, Model model) {
		//logic
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}

}
