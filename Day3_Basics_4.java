
	/*
		constructor name and class name are same
		it used for initialized class variable
		it got called when object of class is created.
	*/

	
	class Student{
		
		private int rollNo; // private is accesible only inside class
		private String name;
		private int std;

		public Student(){	
			System.out.println("Student Class Object Created");
			rollNo = 27;
			name = "keyur";
			std = 10;	
		}
		
		public void setData(int rollNo,String name,int std){
			System.out.println(rollNo+" "+name+" "+std);
			this.rollNo = rollNo;
			this.name = name;
			this.std = std;	
		}
		
		public void print(){
			System.out.println(rollNo+" "+name+" "+std);
		}

	}	
	
	public class Day3_Basics_4 {
		public static void main(String s[]){
			Student stud1 = new Student();	
			stud1.setData(32,"denish",12);
			stud1.print();			
			Student stud2 = new Student();	
			stud2.print();				
			
			int a[]=new int[5]; // create array in java 
			for(int i=0;i<5;i++){
				a[i]=i+1;
			}
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			
			Student studentArray[]=new Student[5];
			
			for(int i=0;i<studentArray.length;i++){
				studentArray[i]=new Student();
				studentArray[i].setData(i+1,"Keyur "+(i+1),1+i);	
			}

			for(int i=0;i<studentArray.length;i++){
				studentArray[i].print();
			}
				
		}
	}