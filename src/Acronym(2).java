import java.util.Scanner;

public class Acronym {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String word1, word2, word3;
		System.out.print("Enter 3 words --> ");
		word1 = keyboard.next();
		
		String w1=word1.substring(0, 1);
		word2 = keyboard.next();
		
		String w2=word2.substring(0, 1);
word3 = keyboard.next();
		
		String w3=word3.substring(0, 1);
		
		
		
		
		
System.out.println("new word = " + w1 + w2 + w3);
		
	}

}
