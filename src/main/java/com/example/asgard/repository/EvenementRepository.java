package com.example.asgard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asgard.model.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, String>{

}
