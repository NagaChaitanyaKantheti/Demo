package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,String> {

}
