package com.vti.backend;

import com.vti.entiy.MyMath;
import com.vti.entiy.PrimaryStudent;
import com.vti.entiy.SecondaryStudent;
import com.vti.entiy.Student;

public class Exrcise2 {
	public static void Question1() {
		double result = MyMath.sum(1, MyMath.pi);
	}
	public static void Question2() {
		Student student = new Student(1,"Bảo");
	}
	public static void Question3() {
		Student pristudent = new PrimaryStudent("Huy");
		pristudent.Study();
		Student seconstudent = new SecondaryStudent("Thuận");
		seconstudent.Study();
	}
}
