import java.sql.Date;
import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {
		Question14();

	}

public class Group {

		int id;
		String name;
		Account creator;
		Account[] accounts;

}
	public static void Question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 1 chuỗi ký tự (có thể cách nhau bằng nhau nhiều khoảng cách");
		String string = scanner.nextLine();
		String character = string.trim();
		int count = character.length();
		System.out.println("tổng số ký tự: "+ count);
		
	}
	public static void Question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập S1:");
		String s1 = scanner.nextLine();
		System.out.println("nhập S2:");
		String s2 = scanner.nextLine();
		System.out.println(s2 +s1);
		
		}
	public static void Question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập tên");
		String name = scanner.nextLine();
		String check = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		System.out.println(check);
	}
	public static void Question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập tên");
		String name = scanner.nextLine();
		int count = name.length();
		for (int i = 0; i < count; i++) {
			int n = i +1;
			char c = name.charAt(i);
			System.out.printf("Ký tự thứ %d là %s%n",n,c);
		}
	}
	public static void Question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yêu cầu nhập vào Họ: ");
		String first = scanner.nextLine();
		System.out.println("Yêu cầu nhập vào Tên: ");
		String last = scanner.nextLine();
		System.out.println("Họ tên bạn: "+ first + last);
	}
	public static void Question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào Họ và Tên: ");
		String name = scanner.nextLine();
		int indexOffirtsWhite = name.indexOf(' ');
		int  indexOflastWhite = name.lastIndexOf(' ');
		String firtsName =  name.substring(0, indexOffirtsWhite);
		String lastName = name.substring(indexOflastWhite+1);
		String midName = name.substring(indexOffirtsWhite+1,indexOflastWhite);
		System.out.println("Họ là: "+firtsName );
		System.out.println("Tên đệm là: "+ midName );
		System.out.println("Tên là: "+lastName );
 	}
	public static void Question7() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Mời bạn nhập vào họ và tên.");

	     System.out.println("Nhập vào họ và tên:");
	     String fullName = scanner.nextLine();

	     String a = fullName.trim().replaceAll("\\s+", " ");
	     System.out.println("=> Câu a: " + a);

	     String[] words = a.split("\\s+");
	     String b = "";
	        for (String word : words) {
	            b += word.substring(0, 1).toUpperCase()
	                    + word.substring(1) + " ";
	        }
	        System.out.println("=> Câu b: " + b);
		
	}
	public static void Question8() {
		String [] groups = {"SQL","Java","JS","Java Srcpit","PHP"};
		for ( String group : groups) {
			if (group.contains("Java")) {
				System.out.println(group);
			}
		}
		
	}
	public static void Question9() {
		String [] groups = {"SQL","Java","JS","Java Srcpit","PHP"};
		for (String group : groups) {
			if (group.equals("Java")) {
				System.out.println(group);
			}
		}
	}
	public static void Question11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập vào 1 chuỗi: ");
		String text = scanner.nextLine();
		int count = 0;
			for  (int i = 0; i <text.length();i++) {
			 if (text.charAt(i) == 'a') {
				 count ++;
				System.out.println(count);
			 }
		}
	}
	public static void Question14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 1 một chuỗi: ");
		String string = scanner.nextLine();
		for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i)=='e' ) {
				String name = string.replaceAll("e", "*");
				System.out.println("e = > *");
				System.out.println(name);
			}
		}
	}

}
