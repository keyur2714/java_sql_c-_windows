	
	/*
		Enter String = "keyursinh";

	
		output :
		
			k
			e
			y
			u
			r					
			s
			i
			n
			h

		--- Reverse String
	
			Input : keyur
			Output : ruyek
		
	*/
	
	import java .util.Scanner;		
	
	public class Day3_Basics_1{
		
		public static void main(String str[]){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Any String : ");
			
			//String s = in.next(); //reading one word
			String s=in.nextLine();
						
			System.out.println("String is : "+s);	
			
			System.out.println("Length of String is : "+s.length());
					
			char c = s.charAt(0);

			System.out.println("First Character : "+c);
	
			for(int i=0;i<s.length();i++){
				System.out.println(s.charAt(i));
			}							
			String revStr  = "";
				          	 
			for(int i=s.length() - 1;i>=0;i--){
				revStr = revStr + s.charAt(i); 
			}	
			System.out.println("Reverse String is : "+revStr);		
		}
		
	}