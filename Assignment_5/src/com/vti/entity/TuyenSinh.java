package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class TuyenSinh implements ITuyenSinh {
	ScannerUtils scannerutils = new ScannerUtils();

	@Override
	public void themThiSinh() {
		ThiSinh thisinh = new ThiSinh();
		thisinh.setHoTen(ScannerUtils.inputName("Nhập vào tên"));
		thisinh.setDiaChi(ScannerUtils.inputName("Nhập vào địa chỉ"));
		thisinh.setSoBaoDanh(ScannerUtils.inputInt("Nhập vào sbd"));
		thisinh.setMucUuTien(ScannerUtils.inputInt("Nhập vào mức ưu tiên"));
		System.out.println("đã thêm thành công");
	}

	@Override
	public void hienThiDSTS() {
		ThiSinh [] thisinh = {new ThiSinh()};
		for (ThiSinh thisinhs : thisinh) {
		System.out.println(thisinh);
		}
		
	}

	@Override
	public void timKiemTheoSBD() {
		ThiSinh thisinh = new ThiSinh();
		int sreach = scannerutils.inputId("Nhập vào sbd cần tìm");
		if(thisinh.getSoBaoDanh() == sreach) {
			System.out.println(" thisinh = " + thisinh);
		}
	}

}
