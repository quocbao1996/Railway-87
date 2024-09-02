package com.vti.entiy;

public class Student implements IStudy {
	protected final int id;
	protected String name;
	public static String college = "Đại học bách khoa";
	public static int moneyGroup;
	public static int count;
	
	public Student(String name){
		if(count >= 7) {
			throw new IllegalStateException("Chỉ được tạo được tối đa 7 học sinh.");
		}
		this.name = name;
		this.id = count++;
	}
	public Student(int id,String name){
		if(count >= 7) {
			throw new IllegalStateException("Chỉ được tạo được tối đa 7 học sinh.");
		}
		this.name = name;
		this.id = count++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	 public static String getCollege() {
	        return college;
	    }
	@Override
	public String toString() {
		
		return "name: " +  this.name + " college: " + college ;
	}
	@Override
	public void Study() {
		System.out.println(this.name + " Đang học bài");
		
	}
	
}