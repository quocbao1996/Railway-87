package com.vti.backend;

import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		Question7();

	}
	public static void Question1() {
		Random random = new Random();
		int a = random.nextInt();
		System.out.println(a);
	}
	public static void Question2() {
		Random random = new Random();
		float b = random.nextFloat();
		System.out.println(b);
	}
	public static void Question3() {
		Random random = new Random();
		String names[] = {"Huy","Thuận","Bảo","Quỳnh","Hải","Hiền"};
		int name = random.nextInt(names.length);
		System.out.println(names[name]);
	}
	public static void Question7() {
		Random random = new Random();
		int x = random.nextInt(900) + 100;
		System.out.println(x);
	}
}
