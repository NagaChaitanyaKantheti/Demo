package com.mappings.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task {
	@Id
	private String id;
	private String name;
	
	@OneToMany
	private List<Stage> stages;

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

	public List<Stage> getStages() {
		return stages;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}

	public Task(String id, String name, List<Stage> stages) {
		super();
		this.id = id;
		this.name = name;
		this.stages = stages;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
