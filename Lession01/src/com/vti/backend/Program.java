package com.vti.backend;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		//Doi tuong 1
		Department department1 = new Department ();
		department1.id = 1;
		department1.name = "Phòng HR";
		//Doi tuong 2
		Department department2 = new Department ();
		department2.id = 2;
		department2.name = "Phòng DEV";
		
		Position position1 = new Position ();
		position1.id = 1;
		position1.name = PositionName.DEV;
	    Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;
		
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "bao@vti.com";
		account1.fullname = "Phạm Trương Quốc Bảo";
		account1.username = "bao";
		account1.gender = Gender.MALE;
		account1.dateBirth = new Date("1996/08/06");
		account1.department = department1;
		account1.position = position1;
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "khoa@vti.com";
		account2.fullname = "Nguyễn Văn Khoa";
		account2.username = "khoa";
		account2.gender = Gender.MALE;
		account2.dateBirth = new Date("1999/11/20");
		account2.department = department2;
		account2.position = position2;
		
		System.out.println("----- Thông tin phòng ban 1 -----");
		System.out.println("Id: " + department1.id);
		System.out.println("Name: " + department1.name);
		
		System.out.println("----- Thông tin user 1 ---- ");
		System.out.println("name: " + account1.fullname);
		System.out.println("id: " + account1.id);
		System.out.println("email: " + account1.email);
		System.out.println("Giới tính: " + account1.gender);
		System.out.println("Ngày Sinh: " + account1.dateBirth);
	}
}
