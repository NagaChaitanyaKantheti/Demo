package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappings.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
