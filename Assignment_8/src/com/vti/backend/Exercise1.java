package com.vti.backend;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.vti.entity.Student;
import com.vti.utils.ScannerUtils;

public class Exercise1 {
	public static void Question1() {
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
		System.out.println("Tổng số học sinh : " +listStudent.size());
		System.out.println("Lấy học sinh thứ 4: " + listStudent.get(3));
		System.out.println("Lấy phần tử đầu và cuối: "+ listStudent.get(0) + listStudent.get(listStudent.size() -1 ) );
		listStudent.add(0,new Student ("Phúc"));
		System.out.println("Danh sách sau khi thêm phần tử đầu ");
		for (Student student : listStudent) {
            System.out.println(student);
        }
		listStudent.add(new Student("Giang"));
        System.out.println("Danh sách sau khi thêm phần tử vào cuối:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        Collections.reverse(listStudent);
        System.out.println("Danh sách sau khi đảo ngược:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        listStudent.remove(5);
        System.out.println("Danh sách sau khi gỡ hs thứ 5");
        for (Student student : listStudent) {
            System.out.println(student);}
        List<Student>studentCopies = new ArrayList<>();
        studentCopies.addAll(listStudent);
        System.out.println("Danh sách studentCopies");
        for (Student student : studentCopies) {
            System.out.println(student);}
        
	}
	 public static void findStudentbyId(List<Student> listStudent,int id) {
     	for(Student student : listStudent) {
     		if(student.getId() == id) {
     			System.out.println(student);
     			return;
     		}
     	} System.out.println("k thấy học sinh");
     }
	 public static void findStudentbyName(List<Student> listStudent,String name) {
	     	for(Student student : listStudent) {
	     		if(student.getName().equals(name)) {
	     			System.out.println( student.getName());
	     			return;
	     		}
	     	} 
	     	System.out.println("K tìm thấy học sinh");
	 }
	 public static void findStudentSameName(List<Student> listStudent) {
	     List<Student> list = new LinkedList<>();	
		 for(Student student : listStudent) {
	     		if(list.contains(student)) {
	     			System.out.println(student.getName());
	     		} else {
	     			list.add(student); 
	     		}
	     	}
	 }
	
	public static void Question2() {
		Stack<String> stack = new Stack<>();
		stack.push("Nguyễn Văn Nam");
		stack.push("Nguyễn Văn Huyên");
		stack.push("Trần Văn Nam");
		stack.push("Nguyễn Văn A");
		System.out.println(stack);
		System.out.println("Danh sách hs từ muộn nhất đến sớm nhất: ");
		while(!stack.empty()){
			String top = stack.pop();
			System.out.println(top);
		}
		System.out.println("Danh sách hs từ sớm nhất đến muốn nhất");
		Queue<String> queue = new LinkedList<>();
		queue.add("Nguyễn Văn Nam");
		queue.add("Nguyễn Văn Huyên");
		queue.add("Trần Văn Nam");
		queue.add("Nguyễn Văn A");
		System.out.println(queue);
	}
	public static void Question3() {
		
	}
	public static void Question4() {
		Set<String> set = new HashSet<>();
		set.add("Hải");
		set.add("Bảo");
		set.add("Bảo");
		set.add("Huy");
		set.add("Giang");
		for(String name : set) {
			System.out.println("name: " + name);
		}
	}
	public static void Question5() {
		Set<String> set = new TreeSet<>();
		set.add("Hải");
		set.add("Bảo");
		set.add("Bảo");
		set.add("Huy");
		set.add("Giang");
		for(String name : set) {
			System.out.println("name: " + name);
		}
	}
	
}

