package vti.com.entity;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner  (System.in);
		public static int inputInt() {
			return inputInt("Hãy nhập ký tự là số");
		}
		public static int inputInt(String err) {
			while (true) {
				try {
					return Integer.parseInt(scanner.nextLine().trim());
				} catch (Exception e) {
					System.err.println(err);
				}
			}
		}
		public static float inputFloat() {
			
			return inputFloat ("Hãy nhập ký tự là số thực");
		}
		public static float inputFloat(String err) {
			while(true) {
				try {
					return Float.parseFloat(scanner.nextLine().trim());
				}catch(Exception e) {
					System.err.println(err);
				}
			}
		}
		public static double inputDouble() {
			return inputDouble ("Hãy nhập ký tự là số phức");
		}
		public static double inputDouble(String err) {
			while(true) {
				try {
					return Double.parseDouble(scanner.nextLine().trim());
				}catch(Exception e) {
					System.err.println(err);
				}
			}
		}
		public static String inputString(String err) {
			while(true) {
				String input = scanner.nextLine();
				if(!input.isEmpty()) {
					return input;
				}else {
					System.err.println(err);
				}
			}
		}
}
