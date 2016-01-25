import java.util.Scanner;
public class VerticalString {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a string --> ");
	String words =  keyboard.nextLine();
	
	int j = words.length();
	
	for (int h = 0 ; h<= (j-1) ; h++)
	{
		System.out.println(words.charAt(h));
	}

	
}

}


