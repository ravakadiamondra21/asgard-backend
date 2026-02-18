package com.example.asgard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asgard.model.Forum;

public interface ForumRepository extends JpaRepository<Forum, String>{

}
