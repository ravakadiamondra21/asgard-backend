package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.ClubService;

@RestController
@RequestMapping("/api/club")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ClubController {
	private ClubService service;
}
