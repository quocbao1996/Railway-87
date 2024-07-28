
public class Department {


			int id;
			String name;
			Department(int id, String name){
				this.id =id;
				this.name = name;
			}
			Department(){
				
			}
			@Override 
			public String toString() {
				// TODO Auto-generated method stub
				return "Department id: " + id +" , "+
					   "Department name: " + name;
			}
			
		
	}


