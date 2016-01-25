import java.util.Scanner;
public class RichterScale {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double magnitude;
		
		System.out.print("Enter a number in the Richter Scale--> ");
magnitude = keyboard.nextDouble();
		

		if(magnitude >= 8.0)
			   System.out.println("Most structures fall");
		
			else if(magnitude >= 7.0)
			   System.out.println("Most buildings destroyed");
		
			else if(magnitude >= 6.0)
			   System.out.println("Many buildings considerably damaged; some collapse");
		
			else if(magnitude >= 4.5)
			   System.out.println("Damage to poorly constructed buildings");
		
			else if(magnitude >= 3.5)
			   System.out.println("Felt by many people, no destruction");
		
			else if(magnitude >= 0)
			   System.out.println("Generally not felt by people");

			else
				System.out.println("Not a Valid Selection!");
		
	}

}
