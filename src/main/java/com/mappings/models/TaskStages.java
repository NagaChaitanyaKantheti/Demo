package com.mappings.models;

import javax.persistence.*;

@Entity
@Table(name="task_stages")
public class TaskStages {
	@Id
	@Column(name="stages_id")
	private String stagesId;
	
	@Column(name="task_id")
	private String taskId;

	public String getStagesId() {
		return stagesId;
	}

	public void setStagesId(String stagesId) {
		this.stagesId = stagesId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public TaskStages(String stagesId, String taskId) {
		super();
		this.stagesId = stagesId;
		this.taskId = taskId;
	}

	public TaskStages() {
		super();
	}
}
