package com.vti.entity;

public class CongNhan extends CanBo {
	public CongNhan(String name, int age, String address, Gender gender) {
		super(name, age, address, gender);
		
	}
	public CongNhan() {
		
	}

	private	int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		
		return "name: "+ getName() +"||"+ " tuổi: " + getAge() 
		+"||"+ " địa chỉ: "+ getAddress() + "||"+" giới tính: " 
				+ getGender() + "||"+" Bậc: " + rank;
	}
	
}
