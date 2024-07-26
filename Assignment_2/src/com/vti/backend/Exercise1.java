package com.vti.backend;

public class Exercise1 {

	public static void main(String[] args) {
		Department department1 = new Department ();
		department1.id = 1;
		department1.name = "Phòng HR";
		Department department2 = new Department ();
		department2.id = 2;
		department2.name = "Phòng DEV";
		Department department3 = new Department ();
		department3.id = 3;
		department3.name = "Sale";
		Department department4 = new Department ();
		department4.id = 4;
		department4.name = "Marketting";
		
		Position position1= new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;
		Position position2= new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;
		
		Account account1 = new Account ();
		account1.email = "Bao@vti";
		account1.fullname = "Quoc Bao";
		account1.department = department1;
		account1.position = position1;
		Account account2 = new Account ();
		account2.email = "Khoa@vti";
		account2.fullname = "Van Khoa";
		account2.department = department2;
		account2.position = position2;
		
		Account[] accounts = {new Account(), new Account (), new Account()};
		Group group1 = new Group();
		group1.accounts = accounts;
		
		
	System.out.println("Question 1");
			if (account2.department == null ) {
				System.out.println ("Nhân viên này chưa có phòng ban");
			}else { 
				System.out.println ("Nhân viên này thuộc phòng ban : " + account2.department.name);
			}
			
			
	System.out.println("Question 3");
		String user2 = (account2.department == null) ? "Nhân viên này chưa có phòng ban" : ("Nhân viên này thuộc phòng ban : " + account2.department.name);
		System.out.println(user2);
		
	System.out.println("Question 4");
		String user1 = (account1.position.name == PositionName.DEV) ? "Đây là Developer" : "Người này không phải Developer";
		System.out.println(user1);
		int account = account1.department.id;
		
	System.out.println("Question 5");
		switch(group1.accounts.length) {
		case 1: System.out.println ("Nhóm này có 1 thành viên");
				break;
		case 2: System.out.println("Nhóm này có 2 thành viên");
				break;
		case 3: System.out.println("Nhóm này có 3 thành viên");
				break;
		default: System.out.println("Nhóm này có nhiều thành viên");
		}
		
	System.out.println("Question 7");
		switch(account1.position.name) {
		case DEV: System.out.println("Đây là developer");
			break;
		default: System.out.println("Đây k phải là developer");
		}
		
	System.out.println("Question  8");
		Account [] users = {account1, account2};
		for (Account user : users) {
			System.out.println("fullname: "+user.fullname);
			System.out.println("email: "+user.email);
			System.out.println("department: "+user.department.name);
	}
	System.out.println("Question  9");
		Department[] departments = {department1, department2};
		for (Department phongban: departments) {
			System.out.println("id : " +phongban.id);
			System.out.println("name: "+ phongban.name);
		}
	System.out.println("Question 10");
		Account accountA = new Account ();
		accountA.email = "NguyenVanA@gmail.com";
		accountA.fullname = " Nguyễn Văn A";
		accountA.department = department3;
		Account accountB = new Account ();
		accountB.email = "NguyenVanB@gmail.com";
		accountB.fullname = " Nguyễn Văn B";
		accountB.department = department4;
		
		Account [] ab = {accountA, accountB};
		for (int i = 0; i < ab.length; i++) {
			System.out.println ("thông tin account thứ " + (i+1) + " là: ");
			System.out.println ("Email: " + ab[i].email);
			System.out.println ("Full Name: " + ab[i].fullname);
			System.out.println ("Phòng ban: " + ab[i].department.name);
		}
	System.out.println("Question 11");
			Department [] departments2 = {department3,department4};
		for (int h = 0; h < departments2.length; h ++) {
			System.out.println ("Thông tin phòng ban thứ: " + (h+1));
			System.out.println ("ID: " + departments2[h].id);
			System.out.println ("Name: " + departments2[h].name);
		}
	System.out.println("Question 12");
		for (int x = 0; x < departments.length; x++) {
			System.out.println("thông tin phòng ban thứ: " +(x+1) +" là: ");
			System.out.println("ID: " + departments[x].id);
			System.out.println("Name: " + departments[x].name );
		}
	System.out.println("Question 15");
		for (int y = 2; y <= 20; y+=2) {
		System.out.println(y);
	    }
	}
}
