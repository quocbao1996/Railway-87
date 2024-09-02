package com.vti.entity;

public class Student {
		private int id;
		private String name;
		private String hometown;
		private double diem;
		
		public Student(String name, String hometown){
			this.name = name;
			this.hometown= hometown;
			this.diem = 0;
		}
		public double setDiem(double diem) {
			return this.diem = diem;
		}
		public double setCongDiem(double d) {
			return this.diem += d;
		}
		public void showInfo() {
			String rank;
			if (diem < 4.0) {
				rank = "Yếu";
			}else if (diem <6.0) {
				rank = "Trung bình";
			}else if(diem <8.0) {
				rank = "Khá";
			}else {
				rank ="Giỏi";
			}
			System.out.println(name +"||"+ " Điểm: "+ diem + " Học lực: " + rank);
		}
		@Override
		public String toString() {
	
		return "id: " + id +"||"+" name: "+name + "||"+"điểm: "+diem ;
		}
}		
