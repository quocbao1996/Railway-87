package com.vti.backend;

import com.vti.entity.MyMath;
import com.vti.entity.Person;
import com.vti.entity.Student;
import com.vti.entity.Student2;

public class Exrcise2 {
	public static void Question1() {
		Student student1 = new Student(1,"Bảo",1);
		Student student2 = new Student(2,"Thảo",1);
		Student student3 = new Student(3,"Huy",3);
		Student student4 = new Student(4,"Thuận",2);
		Student student5 = new Student(5,"Hải",2);
		Student student6 = new Student(6,"Ánh",2);
		Student student7 = new Student(7,"Trúc",3);
		Student student8 = new Student(8,"Giang",1);
		Student student9 = new Student(9,"Ly",1);
		Student student10 = new Student(10,"Hiền",3);
		Student [] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
		System.out.println("------ Cả lớp điểm danh -----");
		for(Student hocsinh : students) {
		hocsinh.diemDanh();
		}
		System.out.println("------ Gọi nhóm 2 làm vs -----");
		for(Student hocsinh : students) {
			if(hocsinh.getGroup() == 2) {
				hocsinh.veSinh();
			}else if ( hocsinh.getGroup() == 1) {
				hocsinh.hocBai();
			}
			
		}
	}
	public static void Question2() {
		Person person = new Person();
		person.inputInfo();
		person.showInfo();
		
	}
	public static void Question3() {
		
	}
	public static void Question4() {
		MyMath mymath = new MyMath();
		float result = mymath.sum(10,20);
		System.out.println(result);
	}
}

