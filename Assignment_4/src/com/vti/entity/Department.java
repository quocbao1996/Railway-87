package com.vti.entity;

public class Department {

			
		public Department(){
			
		}
		public Department(int id, String name){
			this.id = id;
			this.name = name;
		}
		private int id;
		private String name;
		
		public int setId(int id) {
			return this.id=id;
		}
		public String setDepartment(String name) {
			return this.name = name;
		}
		public int getId() {
			return this.id;
		}
		public String getDepartment() {
			return this.name;
		}
		@Override
		public String toString() {
	
		return "id: " + id +"||"+ "name: " +name;
		}
}	
