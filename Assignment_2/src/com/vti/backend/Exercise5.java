package com.vti.backend;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise5 {

	public static void main(String[] args) throws ParseException {
		Question11();
	}

	public static void Question1 (){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập 3 số nguyên: ");
		int sn1 = scanner.nextInt();
		int sn2 = scanner.nextInt();
		int sn3 = scanner.nextInt();
		System.out.printf("Số bạn nhập là : %d,%d,%d%n", sn1,sn2,sn3);
  }
	public static void Question2() {
		System.out.println("Hãy nhập 2 số thực: ");
		Scanner scanner = new Scanner(System.in);
		float st1 = scanner.nextFloat();
		float st2 = scanner.nextFloat();
		System.out.printf("Số bạn nhập là : %.2f và %.2f%n", st1,st2);
	}
	public static void Question3() {
		System.out.println("Hãy nhập Họ và Tên: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Fullname của bạn là: " + name);
	}
	public static void Question4() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String pattern = "dd/mm/yy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println("nhập vào ngày sinh: ");
		String date1 = scanner.nextLine();
		Date date2 = simpleDateFormat.parse(date1);
		System.out.println(date2);
	}
	public static void Question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tạo thông tin account");
		Account account = new Account();
		System.out.println("Nhập vào id");
		account.id = scanner.nextInt();
		System.out.println("Nhập vào full name");
		account.fullname = scanner.nextLine();
		System.out.println("Nhập vào Email");
		account.email = scanner.nextLine();
		System.out.println("Nhập vào position:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");
        Position position = new Position();
        int menu = scanner.nextInt();
		switch (menu) {
		case 1: position.name = PositionName.DEV;
				break;
		case 2: position.name = PositionName.TEST;
				break;
		case 3: position.name = PositionName.SCRUM_MASTER;
				break;
		case 4: position.name = PositionName.PM;
				break;
		}
		account.position = position;
		System.out.println ("Id của bạn là " + account.id);
		System.out.println ("full name của bạn là " + account.fullname);
		System.out.println ("email của bạn là " + account.email);
		System.out.println ("Phòng bạn của bàn là " + position.name);
	}
	public static void Question6() {
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();
		System.out.println("Nhập tên department: ");
		department.name = scanner.nextLine();
		System.out.println("Nhập id department: ");
		department.id = scanner.nextInt();
		System.out.print("Bạn đã tạo thành công phòng ban mới");
		System.out.printf("%ncó id là: %d,  tên là %s%n",department.id, department.name);
	}
	public static void Question7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số chẵn");
		
		while(true) {
			int a = scanner.nextInt();
			if (a % 2 == 0) {
				System.out.println("Số bạn nhập là : " +a);
				break;
			} else {
				System.out.println("Đây không phải là số chẵn mời bạn nhập lại !");
			}
		}
	}
	public static void Question8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn chọn chức năng");
		System.out.println("1. Tạo Account");
		System.out.println("2. Tạo Department");
		while(true) {
		int menu = scanner.nextInt();
		if (menu == 1) {
			Question5();
			break;
		}else if (menu == 2){
			Question6();
			break;
		}else {
			System.out.println("Mời bạn nhập đúng chức năng");
		}
	  }
	}
	public static void Question9() {
		Scanner scanner = new Scanner(System.in);
		Account accountA = new Account();
		accountA.username = "Sơn";
		Account accountB = new Account();
		accountB.username = "Bảo";
		Account accountC = new Account();
		accountC.username = "Ly";
		Account accountD = new Account();
		accountD.username = "Giang";
		Account [] accounts = {accountA, accountB, accountC, accountD};
		
		Group  group1 = new Group();
		group1.name = "Java";
		Group  group2 = new Group();
		group2.name = "SQL";
		Group  group3 = new Group();
		group3.name = "FontEnd";
		Group [] groups = {group1,group2,group3};
		
		System.out.println("Nhập 1 tên account trong danh sách: ");
		for (Account account : accounts) {
			System.out.println(account.username);
		}
		String name = scanner.nextLine();
		System.out.println("Nhập 1 tên group trong danh sách: ");
		for (Group group : groups) {
			System.out.println(group.name);
		}
		String nhom = scanner.nextLine();
		System.out.printf("Bạn đã thêm %s vào group %s%n ",name,nhom);
	}
	public static void Question10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn chọn chức năng");
		System.out.println("1. Tạo Account");
		System.out.println("2. Tạo Department");
		System.out.println("3. Thêm group vào account");
		while(true) {
		int menu = scanner.nextInt();
		if (menu == 1) {
			Question5();
		}else if (menu == 2){
			Question6();
		}else if(menu == 3){
			Question9();
		}
		else {
			System.out.println("Mời bạn nhập đúng chức năng");
			continue;
		}
		while(true) {
			System.out.println("Bạn có muốn thực hiện chức năng khác không ?");
			System.out.println("1. Có/ 2. Không");
			int answer = scanner.nextInt();
			if(answer == 1) {
				Question10();
			}else {
				return;
			}
		}
	  }
	}
	public static void Question11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn chọn chức năng");
		System.out.println("1. Tạo Account");
		System.out.println("2. Tạo Department");
		System.out.println("3. Thêm group vào account");
		System.out.println("4. Thêm account vào group ngẫu nhiên");
		System.out.println("5. Thoát");
		while(true) {
		int menu = scanner.nextInt();
		if (menu == 1) {
			Question5();
		}else if (menu == 2){
			Question6();
		}else if(menu == 3){
			Question9();
		}else if(menu == 4) {
			Random();
		}else if(menu == 5) {
			break;
		}
		else {
			System.out.println("Mời bạn nhập đúng chức năng");
			continue;
		}
		while(true) {
			System.out.println("Bạn có muốn thực hiện chức năng khác không ?");
			System.out.println("1. Có/ 2. Không");
			int answer = scanner.nextInt();
			if(answer == 1) {
				Question10();
			}else {
				return;
			}
		}
	  }
	}
	public static void Random(){
		Scanner scanner = new Scanner(System.in);
		Account accountA = new Account();
		accountA.username = "Sơn";
		Account accountB = new Account();
		accountB.username = "Bảo";
		Account accountC = new Account();
		accountC.username = "Ly";
		Account accountD = new Account();
		accountD.username = "Giang";
		Account [] accounts = {accountA, accountB, accountC, accountD};
		
		Group  group1 = new Group();
		group1.name = "Java";
		Group  group2 = new Group();
		group2.name = "SQL";
		Group  group3 = new Group();
		group3.name = "FontEnd";
		Group [] groups = {group1,group2,group3};
		
		System.out.println("Danh sách Group: ");
		for (Group group : groups) {
			System.out.println(group.name);
		}
		System.out.println("Nhập 1 tên account để thêm vào group ngẫu nhiên: ");
		for (Account account : accounts) {
			System.out.println(account.username);
		}
		String name = scanner.nextLine();
		Random random = new Random();
		int a = random.nextInt(groups.length);
		System.out.printf("bạn đã thêm %s vào " + groups[a].name,name);
	}
}	


