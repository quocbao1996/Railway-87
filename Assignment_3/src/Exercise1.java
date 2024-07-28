import java.util.Random;

public class Exercise1 {

	private static final String Question2 = null;
	public static void main(String[] args) {
		Question4(50,5);

	}
	public static void Question1() {
		float luong1 = 5240.5f;
		float luong2 = 10970.055f;
		int a = (int) luong1;
		int b = (int) luong2;
		System.out.println(a);
		System.out.println(b);
	}
	public static void Question2() {
		Random random = new Random();
		int a = random.nextInt(99999);
		if( a < 9999) {
			System.out.print("a: " + "0" + a );
		}else if ( a < 999) {
			System.out.println("a: " + "00" + a );
		}else if ( a < 99) {
			System.out.println("a: " + "000" + a );
		}else if  (a < 9) {
			System.out.println("a: " + "0000" + a );
		}else {
			System.out.println("a: " + a);
		}
	}
	public static void Question3() {
		  Random random = new Random();
	        int n = random.nextInt(100000);
	        System.out.printf("=> n = %05d.%n", n);
	        System.out.printf("=> 2 số cuối = %d.%n", n % 100);
	}
	public static void Question4(int a, int b) {
		int thuong = a/b;
		System.out.println("thương: " + thuong);
	}
	

}
