package com.pruebapractica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebapractica.model.Person;
import com.pruebapractica.service.IPersonService;

@Controller
public class PersonController {
	
	@Autowired
	private IPersonService service;
	
	@RequestMapping("/listar")
	public String lista(Model model) {
		service.listPerson();
		model.addAttribute("personas", service.listPerson());
		return "consultas";
	}
	
	@GetMapping("/registro")
	public String registro() {
		return "registro";
	}
	
	@PostMapping("/agregar")
	public String agregar( Person p) {
		service.addPerson(p);
		return "redirect:/listar";
	}
	
	@PostMapping("/procesar")
	public String procesar( List<Person> personas) {
		service.processPerson(personas);
		return "redirect:/listar";
	}
}
