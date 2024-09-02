package com.vti.entity;

public abstract class Phone {
	private Contact[] contact;
		public Contact[] getContact() {
		return contact;
	}
	public void setContact(Contact[] contact) {
		this.contact = contact;
	}
		public abstract void insertContact(String name,String phone);
		public abstract void removeContact(String name);
		public abstract void updateContact(String name,String newPhone);
		public abstract void searchContact(String name);
}

