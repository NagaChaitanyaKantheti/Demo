package com.mappings.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="project")
public class Project {
	@Id
	private String id;
	private String name;
	
	@OneToMany
	private List<Task> tasks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Project(String id, String name, List<Task> tasks) {
		super();
		this.id = id;
		this.name = name;
		this.tasks = tasks;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
