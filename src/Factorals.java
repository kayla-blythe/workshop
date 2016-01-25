import java.util.Scanner;
public class Factorals {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//IIIIIIIIII CRRRIIII SOOOOOO  HRRRRDDDDDDDD ),,,,,,:
		
		
		System.out.print("Enter a positive integer to get the factorial--> ");
		int limit = keyboard.nextInt();
		
		
		for(int i = 1; i <= limit; i++){
			long factorial = 1;
			for(int factor = 2; factor <= i; factor++){
			
				
				factorial = factorial*factor;
					
				
			}
			System.out.print(i + "! is ");
			System.out.printf(" %-,1d%n",factorial);
		}	
		
	}

}
