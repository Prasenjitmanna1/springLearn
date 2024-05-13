package com.cognizant.springlearn.bean;

public class Skill {
	
	private int id;
	private String name;
	
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}


	public Skill() {
		System.out.println("Inside Skill Constructor");
	}
	
	
	public int getId() {
		System.out.println("Getting id: " + id);
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting id: " + id);
		this.id = id;
	}
	public String getName() {
		System.out.println("Getting name: " + name);
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name: " + name);
		this.name = name;
	}

}
