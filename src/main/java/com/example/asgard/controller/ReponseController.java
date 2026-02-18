package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.ReponseService;

@RestController
@RequestMapping("/api/reponse")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ReponseController {
	private ReponseService service;
}
