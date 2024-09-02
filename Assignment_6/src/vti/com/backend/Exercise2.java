package vti.com.backend;

import java.util.InputMismatchException;
import java.util.Scanner;

import vti.com.entity.Department;
import vti.com.entity.ScannerUtils;

@SuppressWarnings({ "static-access", "static-access" })
public class Exercise2 {
	ScannerUtils scanner = new ScannerUtils();
	public static void Question1() {
		try {
			float result = divide(7,0);
			System.out.println(result);
		}catch(Exception exp ) {
			System.out.println("cannot divide 0");
		}

	}
	public static float divide 	(int a,int b) {
		return a/b;
	}
	public static void Question2() {
		try {
			float result = divide(7,0);
			System.out.println(result);
		}catch(Exception exp ) {
			System.out.println("cannot divide 0");
		} System.out.println("divide completed");
	}
	public static void Question3() {
		int [] numbers = {1,2,3};
		try {
			System.out.println(numbers[10]);
		}catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("phần tử của mảng k phù hợp");
		}
	}
	public static void Question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập 1 phần tử trong department[3]");
		int index = scanner.nextInt();
;		 try {
	            String[] departments = {"Kỹ thuật", "Giám đốc", "Nhân sự"};
	            System.out.println(departments[index]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Can not find department.");
	        }
	}
	public static void Question5() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Hãy nhập vào 1 tuổi");
		while(true) {
		try {
			String input = scanner.nextLine();
			int age = Integer.parseInt(input);
		if(age<0) {
			System.out.println("Hãy nhập 1 số lớn hơn 0");
		} else {System.out.println("Số tuổi là: " + age);}
		}catch(NumberFormatException input) {
			System.out.println("Hãy nhập số");
	
		}
	 } 
	}
	public static void Question6() throws Exception {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Hãy nhập vào 1 tuổi");
		while(true) {
		try {
			String input = scanner.nextLine();
			int age = Integer.parseInt(input);
		if(age<0) {
			System.out.println("Hãy nhập 1 số lớn hơn 0");
		} else {System.out.println("Số tuổi là: " + age);}
		}catch(Exception input) {
			throw new Exception ("Hãy nhập số");
	
		}
	  }
	}
	public static void Question7() {
		ScannerUtils scanner = new ScannerUtils();
		System.out.println("Hãy nhập vào tuổi");
		scanner.inputInt();
		
	}
	public static void Question8() {
		ScannerUtils scanner = new ScannerUtils();
		System.out.println("Hãy nhập tuổi của dog1");
		Float age = scanner.inputFloat();
		System.out.println("Hãy nhập name của bạn");
		String name = scanner.inputString("không được bỏ trống");
		System.out.println("Hãy nhập tuổi của dog2");
		double age2 = scanner.inputDouble();
		System.out.println("Số tuổi của dog 1: " + age + " số tuổi của dog2: " + age2 + " tên chủ nhân: " + name);
	}
	public static void Question9() throws Exception {
		Department department1 = new Department();
		System.out.println(department1);
	}
}

