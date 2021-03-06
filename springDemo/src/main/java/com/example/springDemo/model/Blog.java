package com.example.springDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {

	@Id
	@GeneratedValue
	private int id;
	private String titulo;
	private String contenido;
	
	public Blog() {
	}

	public Blog(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	

}
