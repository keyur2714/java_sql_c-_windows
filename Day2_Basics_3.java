
	/*
		if i Enter no = 5
		output = 1 , 3 ,  5	
		
		if i Enter no = 7
		output = 1 ,  3 ,  5 ,  7

		5/2 == 2 == remainig = mod  = 1
		
		
	*/
	
	
	public class Day2_Basics_3 {
		public static void main(String args[]){
			System.out.println("Welcome to LoopControl Statements...");

			int no = 7;	
			
			for(int i=1;i<=no;i++){
				if(i == no-1 ){
					if(i % 2 == 0){
						System.out.print(i);			
					}
				}else{
					if(i % 2 == 0){
						System.out.print(i + " , ");		
					}					
				}				
			}			
			
		}
	}	