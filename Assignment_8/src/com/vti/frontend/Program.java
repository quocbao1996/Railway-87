package com.vti.frontend;

import java.util.ArrayList;
import java.util.List;

import com.vti.backend.Exercise1;
import com.vti.entity.Student;

public class Program {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<>();
		Student student1 = new Student("Bảo");
		Student student2 = new Student("Bảo");
		Student student3 = new Student("Bảo");
		Student student4 = new Student("Huy");
		Student student5 = new Student("Thuận");
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		listStudent.add(student5);
		Exercise1.Question2();
	}
}
