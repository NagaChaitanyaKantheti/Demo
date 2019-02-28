package com.mappings.models;

import javax.persistence.*;

@Entity
@Table(name="project_tasks")
public class ProjectTasks {
	@Id
	@Column(name="tasks_id")
	private String tasksId;
	
	@Column(name="project_id")
	private String projectId;
	
	public String getTasksId() {
		return tasksId;
	}
	public void setTasksId(String tasksId) {
		this.tasksId = tasksId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public ProjectTasks(String tasksId, String projectId) {
		super();
		this.tasksId = tasksId;
		this.projectId = projectId;
	}
	public ProjectTasks() {
		super();
		
	}
}
