package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edtclub")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class EdtclubController {

}
