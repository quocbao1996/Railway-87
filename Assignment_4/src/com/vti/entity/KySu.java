package com.vti.entity;

public class KySu extends CanBo{
	public KySu(String name, int age, String address, Gender gender) {
		super(name, age, address, gender);
		// TODO Auto-generated constructor stub
	}
	public KySu() {
		
	}

	private String nganhdaotao;

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	@Override
	public String toString() {
		
		return "name: "+ getName() +"||"+ " tuổi: " + getAge() +"||"+ " địa chỉ: "
		+ getAddress() +"||"+ " giới tính: " + getGender() +"||"+ " Nghành đào tạo: "+ getNganhdaotao();
	}
}
