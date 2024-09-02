package com.vti.entiy;

public class HinhTron extends HinhHoc {
	private double radius;
	public HinhTron(double radius) throws ShapeException {
		super();
		this.radius = radius;
		
	}

	public double  ChuVi() {
		return radius* 2 * MyMath.pi;
		
	}
	public double DienTich() {
		return radius * radius * MyMath.pi;
	}

	@Override
	public String toString() {
		return "[ChuVi()=" + ChuVi() + ", DienTich()=" + DienTich() + "]";
	}
	

}
