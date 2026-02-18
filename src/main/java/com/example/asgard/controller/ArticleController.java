package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.ArticleService;

@RestController
@RequestMapping("/api/article")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ArticleController {
	private ArticleService service;
}
