 
	import java.util.Scanner;
	
	public class Day2_Basics {
		public static void main(String args[]){
			
			System.out.println("Welcome Back...!");

			Scanner in = new Scanner(System.in);

			//int age = 15;
			System.out.print("Enter Your Age.");
			int age = in.nextInt();
		
	
			if(age >= 18){
				System.out.println("You are Eligible for Voting");
			}else{
				System.out.println("You are not Eligible for Voting");
			}					
		}	
	}