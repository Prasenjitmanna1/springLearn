package com.cognizant.springlearn;

public class Country {
	
	private String name;
	private String code;

	public Country() {
		System.out.println("Inside Country Constructor");
	}
	
	public String getName() {
		System.out.println("Getting name: " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name: " + name);
		this.name = name;
	}

	public String getCode() {
		System.out.println("Getting country code: " + code);
		return code;
	}

	public void setCode(String code) {
		System.out.println("Setting country code: " + code);
		this.code = code;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}
	
}
