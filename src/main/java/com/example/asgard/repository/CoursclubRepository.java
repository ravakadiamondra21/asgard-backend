package com.example.asgard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.asgard.model.Coursclub;

public interface CoursclubRepository extends JpaRepository<Coursclub, String>{
	@Query("select cc from Coursclub cc where cc.nomClubOuAss = :name")
	List<Coursclub> findByClub(@Param("name") String name);
}
