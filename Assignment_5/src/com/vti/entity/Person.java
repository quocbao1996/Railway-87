package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Person {
	private int age;
	private String name;
	private String gender;
	private String address;
	public Person() {
		
	}
	public Person(int age, String name, String gender, String address) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	public void inputInfo() {
		ScannerUtils scannerutils = new ScannerUtils();
		this.setName(scannerutils.inputName("Nhập tên"));
		this.setAge(scannerutils.inputId("Nhập vào tuổi"));
		this.setGender(scannerutils.inputName("Nhập giới tính"));
		this.setAddress(scannerutils.inputName("Nhập vào địa chỉ"));
	}
	public void showInfo() {
		System.out.println(this);
	}
	
}
