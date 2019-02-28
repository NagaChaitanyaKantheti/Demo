package com.mappings.models;

import javax.persistence.*;

@Entity
@Table(name="stage")
public class Stage {
	@Id
	private String id;
	private String name;
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
	public Stage(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
