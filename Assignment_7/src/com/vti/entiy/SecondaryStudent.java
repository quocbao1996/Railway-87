package com.vti.entiy;

public final class SecondaryStudent extends Student {
	public static int count;
	@Override
	public String toString() {
		return "SecondaryStudent [id=" + id + ", name=" + name + "]";
	}
	public SecondaryStudent(String name) {
		super(name);
		count ++;
		// TODO Auto-generated constructor stub
	}
}
