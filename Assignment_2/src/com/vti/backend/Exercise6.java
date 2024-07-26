package com.vti.backend;

public class Exercise6 {

	public static void main(String[] args) {
		Question1();
	}
	public static void Question1() {
		for ( int a = 2; a<10; a+=2) {
			System.out.println(a);
		}
	}
	public static void Question2() {
		Account account1 = new Account();
		account1.username = " Sơn";
		account1.gender = Gender.MALE;
		account1.id = 1;
		Account account2 = new Account();
		account2.username = "Bảo";
		account2.gender = Gender.MALE;
		account2.id = 2;
		Account account3 = new Account();
		account3.username = "Ánh";
		account3.gender = Gender.FEMALE;
		account3.id = 3;

	}
	public static void Question3() {
		for ( int b = 0; b<10; b++) {
			System.out.println(b);
	}
  }
}
