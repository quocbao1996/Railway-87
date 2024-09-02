package com.vti.entity;

public class Student2 extends Person {
	
	private int masv;
	private double diemtb;
	private String email;
	public int getMasv() {
		return masv;
		
		
	}
	public Student2() {
		super();
	}
	public Student2(int age, String name, String gender, String address) {
		super(age, name, gender, address);
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public double getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(double diemtb) {
		this.diemtb = diemtb;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void hocbong() {
		if (diemtb >=8.0) {
			System.out.println(getName() +" đã được học bổng");
		}
	}

}
