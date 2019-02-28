package com.mappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.models.Laptop;
import com.mappings.models.Project;
import com.mappings.models.Stage;
import com.mappings.models.Student;
import com.mappings.models.Task;
import com.mappings.repository.LaptopRepository;
import com.mappings.repository.ProjectRepository;
import com.mappings.repository.ProjectTasksRepository;
import com.mappings.repository.StageRepository;
import com.mappings.repository.StudentRepository;
import com.mappings.repository.TaskRepository;
import com.mappings.repository.TaskStagesRepository;

@RestController
public class controller {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	TaskRepository taskRepository;
	
	@Autowired
	StageRepository stageRepository;
	
	@Autowired
	LaptopRepository laptopRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ProjectTasksRepository projectTasksRepository;
	
	@Autowired
	TaskStagesRepository taskStagesRepository;
	
	@PostMapping("/laptops")
	public void saveLaptop(@RequestBody List<Laptop> laptops) {
		laptopRepository.saveAll(laptops);
	}
	
	@GetMapping("/laptops")
	public List<Laptop> getLaptops(){
		return laptopRepository.findAll();
	}
	
	@PostMapping("/students")
	public void saveStudent(@RequestBody List<Student> students) {
		studentRepository.saveAll(students);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	@PostMapping("/projects")
	public void saveProjects(@RequestBody List<Project> projects) {
		projectRepository.saveAll(projects);
	}
	
	@GetMapping("/projects")
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}
	
	@PostMapping("/tasks")
	public void saveTasks(@RequestBody List<Task> tasks) {
		taskRepository.saveAll(tasks);
	}
	
	@GetMapping("/tasks")
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}
	
	@PostMapping("/stages")
	public void saveStages(@RequestBody List<Stage> stages) {
		stageRepository.saveAll(stages);
	}
	
	@GetMapping("/stages")
	public List<Stage> getStages() {
		return stageRepository.findAll();
	}
	
	@GetMapping("/projects/{pid}/tasks")
	public List<Task> getTasksById(@PathVariable String pid){
		List<String> taskIds=projectTasksRepository.findAllWithId(pid);
		return taskRepository.findAllById(taskIds);
	}
	
	@GetMapping("/projects/tasks/{tid}/stages")
	public List<Stage> getStagesById(@PathVariable String tid){
		List<String> stageIds=taskStagesRepository.findAllByTaskId(tid);
		return stageRepository.findAllById(stageIds);
	}
	
}
