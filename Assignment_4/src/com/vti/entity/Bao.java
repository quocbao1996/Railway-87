package com.vti.entity;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;
	public Bao(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh,int ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

}
