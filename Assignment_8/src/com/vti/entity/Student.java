package com.vti.entity;


public class Student {
	private  int id;
	private  String name;
	public static int count = 1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Student (String name) {
		this.name = name;
		this.id = count ++;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	
}
