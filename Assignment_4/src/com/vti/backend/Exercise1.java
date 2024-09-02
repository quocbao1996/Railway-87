package com.vti.backend;

import java.time.LocalDateTime;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Exercise1 {

	public static void main(String[] args) {
	
	}
	public static void Question1() {
		Department department1 = new Department(1,"Sale");
		Department department2 = new Department(2,"Dev");
		System.out.println(department1);
		System.out.println(department2);
	}
	
	public static void Question2() {
		Account account1 = new Account (1,"baovti","Quốc","Bảo");
		Account account2 = new Account (2,"khoavti","Văn","Khoa",new Position(1,"Nhân viên"));
		Account account3 = new Account (3,"thuanvti","Văn","Thuận",new Position(1,"Bảo vệ"),LocalDateTime.now());
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
	}
	public static void Question3() {
		Group group1 = new Group("Dự án 1",new Account(),new Account[]{new Account("Thuận")},LocalDateTime.now());
		Group group2 = new Group("Dự án 2",new Account(1,"Bảo"),new String [] {"Huy"},LocalDateTime.now());
		System.out.println(group2.name);
	}
}
