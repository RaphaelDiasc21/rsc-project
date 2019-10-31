package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Classification;

public interface ClassificationRepository extends JpaRepository<Classification,Long>{

}
