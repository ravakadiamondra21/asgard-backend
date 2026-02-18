package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forum")
@CrossOrigin(origins = "${app.cors.allowwed-origin}")
public class ForumController {
	
}
