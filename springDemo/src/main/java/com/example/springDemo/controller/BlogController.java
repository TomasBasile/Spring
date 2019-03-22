package com.example.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDemo.model.Blog;
import com.example.springDemo.service.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	 @RequestMapping(value="/blog", method=RequestMethod.GET)
	 public ResponseEntity<List<Blog>> consulta(){
		 return new ResponseEntity<List<Blog>>(blogService.consulta(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/blog/{id}", method=RequestMethod.GET)
	 public ResponseEntity<Blog> consultaPorId(@PathVariable("id") int id){
		 return new ResponseEntity<Blog>(blogService.consultaPorId(id), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/blog", method=RequestMethod.POST)
	 public ResponseEntity<Blog> registro(@RequestBody Blog blog){
		 return new ResponseEntity<Blog>(blogService.registro(blog), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/blog/{id}", method=RequestMethod.PUT)
	 public ResponseEntity<Blog> actualizar(@RequestBody Blog blog){
		 return new ResponseEntity<Blog>(blogService.registro(blog), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value="/blog/{id}", method=RequestMethod.DELETE)
	 public ResponseEntity<String> eliminarBlog(@PathVariable("id") int id){
		 Blog blog=blogService.consultaPorId(id);
		 blogService.eliminarBlog(blog);
		 return new ResponseEntity<String>("Blog Eliminado", HttpStatus.OK);
	 }
}
