package com.example.springDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springDemo.model.Blog;
import com.example.springDemo.repository.BlogRepository;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	
	}
	
	@Bean
	public CommandLineRunner setup(BlogRepository blogRepository){
		return (args) ->{
			blogRepository.save(new Blog("Titulo 1 Java", "Contenido java"));
			blogRepository.save(new Blog("Titulo 2 Spring", "Contenido spring"));
			blogRepository.save(new Blog("Titulo 3 Spring boot", "Contenido spring boot"));
			blogRepository.save(new Blog("Titulo 4 Eclipse", "Contenido eclipse"));

		};
	}
}
	
	
 

