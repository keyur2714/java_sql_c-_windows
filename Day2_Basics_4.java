
	/*
		if i Enter no = 5
			1
			12
			123
			1234
			12345			
		Ouptut is :
			*
			**
			***
			****
			*****	
		output:
			*****
			****
			***
			**
			*	
	*/	
	
	public class Day2_Basics_4 {
		public static void main(String args[]){
			
			int no = 5;
			
			for(int i=1;i<=no;i++){
				for(int j=no;j>=i;j--){
					System.out.print(" * ");	
				}
				System.out.println();	
			}			
			
		}
	}