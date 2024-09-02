package com.vti.entity;


public class Position {

	private int id;
	private String name;
		
		public Position(){
			
		}
		public Position(int id, String name){
			this.id = id;
			this.name = name;
		}
		public int setPositionId (int id) {
			return this.id = id;
		}
		public String setPositionName (String name) {
			return this.name = name;
		}
		public int getPositionId() {
			return id;
		}
		public String getPositionName() {
			return name;
		}
		
		@Override
		public String toString() {
			
			return "PositionID: " + id +"||"+ "PositionName: "+name;
		}
}
