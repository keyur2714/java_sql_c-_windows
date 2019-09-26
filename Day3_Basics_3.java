
		
	
	import java .util.Scanner;		
	
	public class Day3_Basics_3{
		
		public static void main(String str[]){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter First String : ");
			
			//String first = in.next(); //reading one word
			String first=in.nextLine();
						
			System.out.println("String is : "+first);	
	
			System.out.print("Enter String for search : ");
			String searchStr = in.next();
	
			System.out.println("Search String is : "+searchStr);			
			
			int findIndex = first.indexOf(searchStr);
			
			if(findIndex != -1){
			System.out.println(searchStr +" is found at position "+findIndex);
			}else{
			System.out.println(searchStr +" is not found in String");
			}
					
			
		}
		
	}