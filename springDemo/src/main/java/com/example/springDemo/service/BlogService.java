package com.example.springDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springDemo.model.Blog;
import com.example.springDemo.repository.BlogRepository;


@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	public List<Blog> consulta(){
		return blogRepository.findAll();
	}
	
	public Blog consultaPorId(int id) {
		return blogRepository.getOne(id);
	}
	
	public Blog registro(Blog blog) {
		return blogRepository.save(blog);
	}
	
	public void eliminarBlog(Blog blog) {
		blogRepository.delete(blog);
	}
	
}