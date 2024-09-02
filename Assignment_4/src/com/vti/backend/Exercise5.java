package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.HighSchoolStudent;
import com.vti.entity.QLCB;
import com.vti.entity.QLTV;

public class Exercise5 {
	public static void Question1() {
		System.out.println("tạo QLCB ");
	}
	public static void Question2() {
			QLCB qlcb = new QLCB();
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("1. Thêm mới cán bộ.");
	            System.out.println("2. Tìm kiếm theo họ tên.");
	            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
	            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
	            System.out.println("5. Thoát khỏi chương trình.");
	            System.out.println("Chọn chức năng: ");
	            int menu = scanner.nextInt();
	            if(menu == 1) {
	            	qlcb.addCanbo();
	            }else if (menu ==2) {
	            	qlcb.sreachCanbo();
	            }else if (menu == 3) {
	            	qlcb.showCanbo();
	            }else if (menu ==4) {
	            	qlcb.xoaCanbo();
	            }else if(menu == 5) {
	            	return;
	            }else {
	            	System.out.println("Xin hãy chọn đúng chức năng");
	            }
			}
	}
	public static void Question3() {
		HighSchoolStudent hightschoolstudent = new HighSchoolStudent(1,"Nam","Chuyên Văn","Đại học công nghệ");
		System.out.println(hightschoolstudent);
	}
	 public void Question4() {
	        Scanner scanner = new Scanner(System.in);
	        QLTV qltv = new QLTV();
	        while (true) {
	            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
	            System.out.println("2. Xoá tài liệu theo mã tài liệu.");
	            System.out.println("3. Hiện thị thông tin về tài liệu.");
	            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
	            System.out.println("5. Thoát khỏi chương trình");
	            System.out.println("Chọn chức năng bạn muốn dùng: ");
	            int menu = scanner.nextInt();
	            if (menu == 1) {
	                qltv.themTaiLieu();
	            } else if (menu == 2) {
	                qltv.xoaTaiLieuTheoId();
	            } else if (menu == 3) {
	                qltv.hienThiDSTL();
	            } else if (menu == 4) {
	                qltv.timKiemTaiLieuTheoLoai();
	            } else if (menu == 5) {
	                return;
	            } else {
	                System.out.println("Vui lòng chọn đúng chức năng.");
	            }
	        }
	    }
}
