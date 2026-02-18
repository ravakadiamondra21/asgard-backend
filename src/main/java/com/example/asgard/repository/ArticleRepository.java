package com.example.asgard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asgard.model.Article;

public interface ArticleRepository extends JpaRepository<Article, String>{

}
