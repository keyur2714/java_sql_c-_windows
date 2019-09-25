	
	/* 
	 per - >=50  && <60 -- Second
	 per >= 60 && <70 - First
	 per >= 70  - Dist
	 per >= 40 - Pass
	 per < 40 - Fail	
	*/
	
	import java.util.Scanner;
	
	public class Day2_Basics_2 {
		
		public static void main(String args[]){
			System.out.println("Welcome to Java world...!");
			
			System.out.print("Enter Percentage : ");

			Scanner in = new Scanner(System.in);
			
			float per = in.nextFloat();

			if(per >= 70){
				System.out.println("Distinction");
			}else if(per >= 60){
				System.out.println("First");
			}else if(per >=50){
				System.out.println("Second");
			}else if(per >=40){
				System.out.println("Pass");
			}else{
				System.out.println("Fail");
			}				
	
					
			System.out.println("Percentage Are : "+per);						

		}
		
	}