package com.vti.entiy;

public class HinhChuNhat extends HinhHoc {
	@Override
	public String toString() {
		return "[ChuVi()=" + ChuVi() + ", DienTich()=" + DienTich() + "]";
	}

	private double height;
	private double widht;
	public HinhChuNhat(double widht, double height) throws ShapeException {
		super();
		this.height = height;
		this.widht = widht;
	}

	@Override
	public double ChuVi() {
		
		return 2*(height+widht);
	}

	@Override
	public double DienTich() {

		return height*widht;
	}

}
