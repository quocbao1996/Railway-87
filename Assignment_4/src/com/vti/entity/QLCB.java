package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class QLCB {

	public void addCanbo() {
		ScannerUtils scannerutils = new ScannerUtils();
		CanBo canbo = new CanBo();
		canbo.setName(scannerutils.inputName("Nhập họ tên"));
		canbo.setAge(scannerutils.inputId("nhập vào tuổi"));
		int gioitinh = scannerutils.inputId("Nhập vào giới tính (1. NAM, 2. NU, 3. KHAC): ");
			switch(gioitinh) {
			case 1: canbo.setGender(Gender.NAM);
					break;
			case 2: canbo.setGender(Gender.NU);
			break;
			case 3: canbo.setGender(Gender.KHAC);
			break;
			}
		canbo.setAddress(scannerutils.inputName("Nhập vào địa chỉ"));
		System.out.println("1. Công Nhân");
		System.out.println("2. Kỹ Sư");
		System.out.println("3. Nhân Viên");
		int menu = scannerutils.inputId("Hãy chọn class");
		if (menu == 1) {
			CongNhan congnhan = new CongNhan(canbo.getName(), canbo.getAge(),canbo.getAddress(),canbo.getGender());
			congnhan.setRank(ScannerUtils.inputId("Hãy nhập vào bậc"));
			System.out.println(congnhan);
		}
		else if (menu == 2) {
			KySu kysu = new KySu(canbo.getName(), canbo.getAge(),canbo.getAddress(),canbo.getGender());
			kysu.setNganhdaotao(ScannerUtils.inputName("Hãy nhập vào nghành đào tạo"));
			System.out.println(kysu);
		}else if (menu == 3) {
			NhanVien nhanvien = new NhanVien();
			nhanvien.congviec = ScannerUtils.inputName("Hãy nhập vào công việc: ");
			System.out.println(nhanvien);
		}else {
			System.out.println("xin hãy nhập đúng");
		}
			System.out.println("Đã thêm thành công");
	}
	public void sreachCanbo() {
		CanBo canbo = new CanBo();
		String name = ScannerUtils.inputName("Nhập vào tên cần tìm");
		if (name.equals(canbo.getName())) {
			System.out.println("name: "+canbo.getName());
		}else {
			System.out.println("Không có tên cần tìm");
		}
	}
	public void showCanbo() {
		CanBo canbo1 = new CanBo("Quốc Bảo");
		CanBo canbo2 = new CanBo("Thanh Huy");
		CanBo canbo3 = new CanBo("Văn Thuận");
		System.out.println(canbo1.getName());
		System.out.println(canbo2.getName());
		System.out.println(canbo3.getName());
	}
	public void xoaCanbo() {
		CanBo canbo = new CanBo();
		String name = ScannerUtils.inputName("Nhập tên cần xóa");
		System.out.println("Đã xóa thành công");
		
	
	}
}
