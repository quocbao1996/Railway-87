package com.vti.entity;

import java.sql.Date;
import java.time.LocalDateTime;

public class Group {

		public int id;
		public String name;
		public Account creator;
		public LocalDateTime createDate;
		public Account[] accounts;
		
		public Group(){
			
		}
		public Group(int id, String name) {
			
		}
		public Group(String name, Account creator, Account[] accounts,LocalDateTime createDate ){
			this.name = name;
			this.creator = creator;
			this.accounts = accounts;
			this.createDate= createDate;
		}
	
		public Group(String name, Account creator, String[] usernames,LocalDateTime createDate ){
			this.name = name;
			this.creator = creator;
			Account [] acc = new Account[usernames.length];
			for(int i = 0; i < usernames.length; i++) {
				Account a = new Account();
				a.setUsername(usernames [i]);
				acc[i] = a;
			}
			this.accounts = acc;
			this.createDate= createDate;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return id + name + creator +  createDate + accounts;
		}
}
