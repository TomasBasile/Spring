package com.example.chargeAHeadDemo.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.chargeAHeadDemo.model.PersonaModelo;

@Service
public class PersonaService {
	Hashtable<String, PersonaModelo> persona = new Hashtable<String, PersonaModelo>();

	public PersonaService() {
		PersonaModelo p = new PersonaModelo();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Tomas");
		p.setLastName("Basile");
		persona.put("1", p);

		p = new PersonaModelo();
		p.setId("2");
		p.setAge(23);
		p.setFirstName("Juan");
		p.setLastName("Galvan");
		persona.put("2", p);
	}

	public PersonaModelo getAsignoId(String id) {
		if (persona.containsKey(id))
			return persona.get(id);
		else
			return null;
	}

	public Hashtable<String, PersonaModelo> getMuestroPersona() {
		return persona;
	}

}