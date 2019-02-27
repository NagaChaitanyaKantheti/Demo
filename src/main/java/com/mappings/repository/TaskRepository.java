package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,String> {

}
