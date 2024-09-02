package com.vti.entity;

public abstract class TaiLieu {
	protected int maTaiLieu;
	protected String nhaXuatBan;
	protected int soBanPhatHanh;
	public TaiLieu(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh
				+ "]";
	}
	
}
