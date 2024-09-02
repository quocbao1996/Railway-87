package com.vti.backend;

import com.vti.entity.Circle;
import com.vti.entity.Student;
import com.vti.entity.date;

public class Exercise4 {

	public static void Question1() {
		Student student1 = new Student("Bảo","HCM");
		student1.setDiem(7.0);
		student1.showInfo();
		student1.setCongDiem(1.5);
		student1.showInfo();
		
		Student student2 = new Student("Huy","HCM");
		student2.setDiem(5.0);
		student2.showInfo();
		student2.setCongDiem(1.5);
		student2.showInfo();
	}
	public static void Question2() {
		Circle circle = new Circle(1,"Đỏ");
		circle.getArea();
		System.out.println("Diện tích: " + circle.getArea());
		System.out.println(circle);
		
		date date1 = new date(24,6,2024);
		System.out.println(date1);
		date1.leapYear();
	}
}
