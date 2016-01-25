import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a Number --> ");
		int rows = keyboard.nextInt();
		
		for(int r = 1; r < rows; r++)
		{
            for(int j = 1; j <= r; j++)
            	{
                System.out.print("*");
            	}           
            System.out.println();            
			}
		
		
		for(int r = 1; r <= rows; r++) 
        {
            for(int f = rows; f >= r; f--)   
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
