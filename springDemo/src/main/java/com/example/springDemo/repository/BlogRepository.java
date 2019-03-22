package com.example.springDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springDemo.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{


}