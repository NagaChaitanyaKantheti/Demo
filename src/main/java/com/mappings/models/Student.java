package com.mappings.models;

import java.util.List;

import javax.persistence.*;

@Entity

public class Student {
	
	@Id
	private int rollNo;
	private String name;
	
	@ManyToMany
	private List<Laptop> laptops;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	public Student(int rollNo, String name, List<Laptop> laptops) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.laptops = laptops;
	}
	
	
}
