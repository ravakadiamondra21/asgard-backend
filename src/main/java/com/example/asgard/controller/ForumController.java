package com.example.asgard.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.ForumService;

@RestController
@RequestMapping("/api/forum")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ForumController {
	private ForumService forumService;

	public ForumController(ForumService forumService) {
		super();
		this.forumService = forumService;
	}
	
	@PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
	@GetMapping("/countAllForum")
	public long countAllForum() {
		return this.forumService.countForum();
	}
}
