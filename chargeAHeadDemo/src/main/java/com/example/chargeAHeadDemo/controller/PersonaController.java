package com.example.chargeAHeadDemo.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chargeAHeadDemo.model.PersonaModelo;
import com.example.chargeAHeadDemo.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaService ps;

	@RequestMapping("/all")
	public Hashtable<String, PersonaModelo> getAll() {
		return ps.getMuestroPersona();
	}

	@RequestMapping("{id}")
	public PersonaModelo getPersona(@PathVariable("id") String id) {
		return ps.getAsignoId(id);
	}

}
