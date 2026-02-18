package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.FichierService;

@RestController
@RequestMapping("/api/fichier")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class FichierController {
	private FichierService service;
}
