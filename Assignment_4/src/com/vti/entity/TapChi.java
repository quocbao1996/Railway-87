package com.vti.entity;

public class TapChi extends TaiLieu {
	private String soPhatHanh;
	private int thangPhatHanh;
	public TapChi(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh,String soPhatHanh,int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

}
