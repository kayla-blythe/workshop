import java.util.Scanner;
public class SquareWords {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string --> ");
		String word =  keyboard.nextLine();
		
		System.out.println(word);
		
		String width = ""; 
// i cri so hrd x2 );
		
		for(int i = 0; i < word.length() - 2; i++)   
		{
		   width += " ";
		}
		
		
		
		int j = word.length()-1;
		
		for (int i = 0 ; i<= j ; i++)
		{
			System.out.println(word.charAt(i) + width + word.charAt(j-i));
		}
		
		System.out.println(word);
		

	}

}
