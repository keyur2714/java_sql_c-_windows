	
	
	import java .util.Scanner;		
	
	public class Day3_Basics_2{
		
		public static void main(String str[]){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter First String : ");
			
			//String first = in.next(); //reading one word
			String first=in.nextLine();
						
			System.out.println("First String is : "+first);	
			
			System.out.print("Enter Second String : ");
			
			String second = in.nextLine();
			
			System.out.println("Second String is : "+second);

			if(first.equalsIgnoreCase(second) == true){
				System.out.println("Both String are same.");	
			}else{
				System.out.println("Both String are not same.");	
			}		
			
			
		}
		
	}