package com.vti.entity;

public class HighSchoolStudent extends Student2{
	protected String clazz;
	protected String desiredUniversity;
	
	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
		super(id, name);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent [clazz= " + clazz + ", desiredUniversity= " + desiredUniversity 
				+ ", name= " + this.getName() + ", id= " + id + "]";
	}


}
