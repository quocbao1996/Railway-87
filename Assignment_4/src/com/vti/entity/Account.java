package com.vti.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Account {

		private int id;
		private String email;
		private String username;
		private String fullname;
		private Department department;
		private Position position;
		private LocalDateTime createDate;
		
		public Account () {
			
		}
		public Account(String username) {
			this.setUsername(username);
		}
		public Account(int id, String username) {
			this.id= id;
			this.setUsername(username);
		}
		public Account (int id, String username,String firstname, String lastname) {
			this.id=id;
			this.setUsername(username);
			this.fullname = firstname + " " +lastname;
		}
		public Account (int id, String username,String firstname, String lastname, Position position) {
			this.id=id;
			this.setUsername(username);
			this.fullname = firstname + " " +lastname;
			this.position = position;
		}
		public Account (int id, String username,String firstname, String lastname, Position position,LocalDateTime createDate ) {
			this.id=id;
			this.setUsername(username);
			this.fullname = firstname + " " +lastname;
			this.position = position;
			this.createDate = createDate;
		}
		public int getId() {
			return this.id=id;
		}
		public String username() {
			return this.setUsername(username);
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public Position getPosition() {
			return position;
		}
		public void setPosition(Position position) {
			this.position = position;
		}
		public LocalDateTime getCreateDate() {
			return createDate;
		}
		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}
		@Override
		public String toString() {
		
		return id + "||" + getUsername() +"||"+ fullname+"||"+ position+"||"+createDate;
		}
		public String getUsername() {
			return username;
		}
		public String setUsername(String username) {
			this.username = username;
			return username;
		}

}
