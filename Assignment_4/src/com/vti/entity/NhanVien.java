package com.vti.entity;

public class NhanVien extends CanBo{
		public String congviec;
		public NhanVien(String name, int age, String address, Gender gender) {
		super(name, age, address, gender);
	   }
		public NhanVien() {
			
		}


		@Override
		public String toString() {
	
		return "name: "+ getName() +"||"+ " tuổi: " + getAge() +"||"+ " địa chỉ: "
				+"||"+ getAddress() + " giới tính: " + getGender() +"||"+ " Công việc" +
				congviec;
		}
}
