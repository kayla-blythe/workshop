import java.util.Scanner;

public class LastLetter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String w1;
				
		System.out.print("Enter a string --> ");
		w1 = keyboard.nextLine();
		
		int len = w1.length();
		char lastLetter = w1.charAt(len - 1);
	
		System.out.print("Last letter is " + lastLetter);
		
		
		
	}

}
