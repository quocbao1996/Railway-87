package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.TuyenSinh;

public class Exrcise1 {
	public static void Question02() {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát chương trình");
            System.out.println("Vui lòng chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                tuyenSinh.themThiSinh();
            } else if (menu == 2) {
                tuyenSinh.hienThiDSTS();
            } else if (menu == 3) {
                tuyenSinh.timKiemTheoSBD();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn lại.");
            }
        }
    }
}
