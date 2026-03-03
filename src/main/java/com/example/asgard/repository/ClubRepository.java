package com.example.asgard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.asgard.model.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {
	
	@Query("SELECT c FROM Club c WHERE c.approved = :approve")
	List<Club> findByApprove(@Param("approve") boolean approve);
}
