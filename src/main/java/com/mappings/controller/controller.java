package com.mappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.models.Laptop;
import com.mappings.models.Project;
import com.mappings.models.Student;
import com.mappings.repository.LaptopRepository;
import com.mappings.repository.ProjectRepository;
import com.mappings.repository.StudentRepository;

@RestController
public class controller {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	LaptopRepository laptopRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/saveLaptops")
	public void saveLaptop(@RequestBody List<Laptop> laptops) {
		laptopRepository.saveAll(laptops);
	}
	
	@GetMapping("/getLaptops")
	public List<Laptop> getLaptops(){
		return laptopRepository.findAll();
	}
	
	@PostMapping("/saveStudents")
	public void saveStudent(@RequestBody List<Student> students) {
		studentRepository.saveAll(students);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	@PostMapping("/saveProjects")
	public void saveProjects(@RequestBody List<Project> projects) {
		projectRepository.saveAll(projects);
	}
	
}
