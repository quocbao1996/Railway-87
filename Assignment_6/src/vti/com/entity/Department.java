package vti.com.entity;

public class Department {
	private ScannerUtils scanner;
	private int id;
	private String name;
	
	public Department() throws Exception {
		this.id = inputId();
		this.name = inputName();
	}
	public int inputId() throws Exception {
		System.out.println("Hãy nhập số id");
		try {
			int age = scanner.inputInt();
				return age;
		}catch (Exception e) {
			throw new Exception("Chỉ được nhập số");
		}
	}
	public String inputName() throws Exception {
		System.out.println("Hãy nhập name");
		try {
			String name = scanner.inputString("ký tự không phù hợp") ;
			return name;
		}catch(Exception e) {
			throw new Exception("Chỉ được nhập ký tự chữ");
		}
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Department [ id=" + id + ", name=" + name + "]";
	}
}
