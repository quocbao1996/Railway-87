
public class Exercise5 {

	public static void main(String[] args) {
		Question5() ;
	}

	public static void Question1() {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "phòng HR";
		System.out.println(department1);
	}
	public static void Question2() {
		Department department1 = new Department(1,"phòng HR");
		Department department2 = new Department(2,"phòng Sale");
		Department department3 = new Department(3,"phòng Dev");
		Department [] departments = {department1,department2,department3};
		for (Department info : departments)
		System.out.println(info);
	}
	public static void Question3() {
		   Department department = new Department();
	        department.id = 1;
	        department.name = "Giám đốc";

	        System.out.println("Hash code = " + department.hashCode());
	}
	public static void Question4() {
		  Department department = new Department();
	        department.id = 1;
	        department.name = "Giám đốc";

	        boolean answer = department.name.equals("Phòng A");
	        System.out.println("Answer = " + answer);
	}
	public static void Question5() {
		Department department1 = new Department(1,"phòng HR");
		Department department2 = new Department(2,"phòng Sale");
		if (department1.name.equals(department2.name)) {
			System.out.println("2 phòng ban giống nhau");
		}else {
			System.out.println("2 phòng ban khác nhau");
		}
	}
}
