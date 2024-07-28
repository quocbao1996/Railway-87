
public class Exercise3 {

	public static void main(String[] args) {
		Question2();
	}
	public static void Question1() {
		Integer a = 5000; 
		float b = a.floatValue();
		System.out.printf("%.2f%n",b);
	}
	public static void Question2() {
		String x = "1234567";
		int y = Integer.valueOf(x);
		System.out.println(y);
	}
	public static void Question3() {
		Integer a = new Integer ("1234567");
		int b = a.intValue();
		System.out.println(b);
	
	}

}
