package com.vti.entity;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name,phone);
		Contact [] contacts = {contact};
		this.setContact(contacts);
		
		
	}

	@Override
	public void removeContact(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchContact(String name) {
		// TODO Auto-generated method stub
		
	}

}
