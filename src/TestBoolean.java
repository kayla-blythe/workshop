import java.util.Scanner;
public class TestBoolean {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int temp;
		
		System.out.print ("Enter a temperature between 0 - 105");
		temp = keyboard.nextInt();
		
		if(temp <= 100)
			System.out.println("What nice cool weather we are having!");
		
		//when false 1st sentence will not work
		boolean test = true;
		if (test)
			System.out.println("The variable has a value of true.");
		
		System.out.println("This is the end of the program");
		
	}

}
