package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Classification;
import com.example.demo.service.ClassificationService;

@RestController
public class MainController {
	
	@Autowired
	private ClassificationService cs;
	
	@RequestMapping("/api/{id}")
	public Classification index(@PathVariable("id") long id) {
		return cs.getClassification(id);
	}
}
