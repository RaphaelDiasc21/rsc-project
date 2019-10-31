package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Classification;
import com.example.demo.persistence.ClassificationRepository;

@Service
public class ClassificationService {
	
	@Autowired
	private ClassificationRepository cr;
	
	public Classification getClassification(long id) {
		return cr.getOne(id);
	}
}
