package com.vti.entity;

import java.util.Scanner;

public class Program {
	public static void main(String args []) {
		Scanner  scanner = new Scanner (System.in);
		boolean tiepTuckhong = true;
		while(tiepTuckhong) {
			System.out.println("Mời nhập số a");
			int a = scanner.nextInt();
			if(a<10) {
				System.out.println(a + " là số có 1 chữ số");
			}else {
				System.out.println(a+ " là số có nhiều chữ số");
			}
			System.out.println("ban có muốn tiếp tục k ? Y/N");
			String result = scanner.next();	
		
			if(result.equals("Y")) {
				tiepTuckhong = true;
			}else {
				tiepTuckhong = false;
			}
		} System.out.println("Chương trình đã đóng");
		
		
	}
	
}
