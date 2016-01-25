import java.util.Scanner;
public class SportsEvent {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		 double [] scores = new double [9];			
		
		System.out.println("Enter the eight scores of the contestant: ");
		
		System.out.println();
	
		double max = 0;
		
		double min = 100;
		
		int i;
		
		double sum = 0;
		
		int count = 1;
		
			for (i = 0; i < 8; i++)	
			{
			
				System.out.print("Judge " + count + " --> ");
				scores[i] = keyboard.nextDouble();
					 count++;
		
		 	}
		
		System.out.println();
		
		System.out.println("                                Summary                                ");
		System.out.println("=======================================================================");
		
		System.out.print("Scores = ");
		
			for (i = 0; i < 8; i++)	
			{
				
				System.out.print(scores[i]);
					if (i < 7)
				System.out.print(" , ");
					
					if (scores[i] > max)
						max = scores[i];
					
					if (scores[i] < min)
						min = scores[i];
					
					sum += scores[i];
					
			}
			System.out.println();
			
			sum -= (min + max);
			sum /= 6;
			
			System.out.println("Highest Score = " + max);
			System.out.println("Lowest Score = " + min);
			System.out.println("Average = " + sum);
		
			System.out.println();
		
		
		
		
	}

}
