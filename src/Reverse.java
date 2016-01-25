import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 20 Numbers");
		System.out.println();	
		
		int [] numbers = new int[20];
		int count = 1;
		
			for (int x = 0; x < 20; x++)
			{
			
				System.out.print("Num " + count + " = ");
				numbers[x] = keyboard.nextInt();
				count++;
				
			}
			
		System.out.println();
			
	
			for (int x = 0; x < 20; x++)
			{	
				
				System.out.print(numbers[x]+" ");
			
			}
			
		System.out.println();
			
			for (int x = 19; x >= 0; x--)
			{	
			
				System.out.print(numbers[x] +" ");
				
			}
				
	}

}
