import java.util.Scanner;
public class MixUp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String w1;
		
		System.out.print("Enter a string --> ");
		w1 = keyboard.nextLine();
		
		int len = w1.length();
		String firstHalf = w1.substring(len/2);
		String secondHalf = w1.substring(0, len/2);
		
System.out.print(firstHalf + secondHalf);
		
		
	}

}
