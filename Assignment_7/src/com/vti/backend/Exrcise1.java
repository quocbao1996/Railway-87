package com.vti.backend;

import com.vti.entiy.Configs;
import com.vti.entiy.HinhChuNhat;
import com.vti.entiy.HinhHoc;
import com.vti.entiy.HinhTron;
import com.vti.entiy.MyMath;
import com.vti.entiy.PrimaryStudent;
import com.vti.entiy.SecondaryStudent;
import com.vti.entiy.ShapeException;
import com.vti.entiy.Student;
import com.vti.utils.ScannerUtils;

public class Exrcise1 {
	public static void Question1() {
		Student student1 = new Student("Nguyễn văn A");
		Student student2 = new Student("Nguyễn văn B");
		Student student3 = new Student("Nguyễn văn C");
		Student student4 = new Student("Nguyễn văn D");
		Student [] students = {student1, student2,student3,student4};
		for (Student student : students) {
			System.out.println(student);
		}
		Student.college = "Đại học công nghệ";
		for (Student student : students) {
			System.out.println(student);
		}
	}
	public static void Question2() {
	    Student studentA = new Student("Nguyễn Văn A");
        Student studentB = new Student("Nguyễn Văn B");
        Student studentC = new Student("Nguyễn Văn C");
        Student[] students = {studentA, studentB, studentC};

        for (Student student : students) {
            student.moneyGroup += 100;
        }
        System.out.println("Tiền quỹ ban đầu = " + Student.moneyGroup);
        studentA.moneyGroup -= 50;
        System.out.println("Tiền quỹ sau khi A sài = " + Student.moneyGroup);
        studentB.moneyGroup -=20;
        System.out.println("Tiền quỹ sau khi B sài = " + Student.moneyGroup);
        studentC.moneyGroup -=150;
        System.out.println("Tiền quỹ sau khi C sài = " + Student.moneyGroup);
        for (Student student : students) {
            student.moneyGroup += 50;
        }
        System.out.println("Tiền quỹ sau cùng = " + Student.moneyGroup);
	}
	public static void Question3() {
		int solon = MyMath.max(5, 10);
		System.out.println(solon);
		double tong = MyMath.sum(5, 10);
		System.out.println(tong);
		int hieu = MyMath.min(5, 10);
		System.out.println(hieu);
	}
	public static void Question4() {
		Student student1 = new Student("Nguyễn văn A");
		Student student2 = new Student("Nguyễn văn B");
		Student student3 = new Student("Nguyễn văn C");
		Student student4 = new Student("Nguyễn văn D");
		Student [] students = {student1, student2,student3,student4};
		Student.setCollege("Đại học hutech");
		for (Student student : students) {
			System.out.println(student);
		}
	}
	public static void  Question5() {
		Student student1 = new Student("Nguyễn văn A");
		Student student2 = new Student("Nguyễn văn B");
		Student student3 = new Student("Nguyễn văn C");
		Student student4 = new Student("Nguyễn văn D");
		Student student5 = new Student("Nguyễn văn E");
			System.out.println("số lượng sinh viên: "+Student.count);
		}
	public static void  Question6() {
		Student student1 = new PrimaryStudent("Nguyễn văn A");
		Student student2 = new PrimaryStudent("Nguyễn văn B");
		Student student3 = new SecondaryStudent("Nguyễn văn C");
		Student student4 = new SecondaryStudent("Nguyễn văn D");
		Student student5 = new SecondaryStudent("Nguyễn văn E");
		System.out.println("số lượng sinh viên: "+Student.count);
		System.out.println("số lượng PrimaryStudent: "+PrimaryStudent.count);
		System.out.println("số lượng SecondaryStudent: "+SecondaryStudent.count);
	}
	public static void  Question7() {
		Student student1 = new PrimaryStudent("Nguyễn văn 1");
		Student student2 = new PrimaryStudent("Nguyễn văn 2");
		Student student3 = new SecondaryStudent("Nguyễn văn 3");
		Student student4 = new SecondaryStudent("Nguyễn văn 4");
		Student student5 = new SecondaryStudent("Nguyễn văn 5");
		Student student6 = new SecondaryStudent("Nguyễn văn 6");
		Student student7 = new SecondaryStudent("Nguyễn văn 7");
		Student student8 = new SecondaryStudent("Nguyễn văn 8");
		System.out.println("số lượng sinh viên: "+Student.count);
	}
	public static void Question8() throws ShapeException {
		HinhHoc[] danhSachHinh = new HinhHoc[Configs.SO_LUONG_HINH_TOI_DA];
		int soluonghinh = 0;
		ScannerUtils scanner = new ScannerUtils();
		while(true) {
			System.out.println("chọn loại hình để tạo: ");
			System.out.println("1. Hình tròn ");
			System.out.println("2. Hình chữ nhật ");
			System.out.println("3. thoát ");
			int menu = scanner.inputInt();
			if(menu == 3) {
				return;
			}
			try {
				if(soluonghinh >= Configs.SO_LUONG_HINH_TOI_DA) {
					throw new ShapeException("số lượng hình tối đa là: " +Configs.SO_LUONG_HINH_TOI_DA );
					
				}
			switch(menu) {
				case 1:
					System.out.println("Nhập bán kính hình tròn");
					double bankinh = scanner.inputDouble("Hãy nhập đúng ");
					HinhHoc hinhtron = new HinhTron(bankinh);
					danhSachHinh[soluonghinh++] = hinhtron;
					break;
				case 2:
					System.out.println("Nhập chiều cao và chiều rộng");
					int height = scanner.inputInt("Chiều cao: ");
					int widht = scanner.inputInt("Chiều rộng: ");
					HinhHoc hinhchunhat = new HinhChuNhat(height, widht);
					danhSachHinh[soluonghinh++] = hinhchunhat;
					break;
				default:
					System.out.println("Lựa chọn k hợp lệ");
				}
			}catch(ShapeException e){
				e.getMessage();
			}
			System.out.println("Danh sách hình và thông tin: ");
			for(int i = 0; i < soluonghinh; i++ ) {
				HinhHoc hinh = danhSachHinh[i];
				System.out.println(hinh.getClass().getSimpleName()+"["+i+"]"+ ": ");
				System.out.println("Chu vi: " + hinh.ChuVi());
	            System.out.println("Diện tích: " + hinh.DienTich());
			}
		}
		
	}
	public static void Question9() {
		
	}
}
