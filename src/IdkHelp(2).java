import java.util.Scanner;
public class IdkHelp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter y for yes or n for no");
		String yes = "";

		
		do
		{
			System.out.println("Is this really difficult ): ?");
			yes =  keyboard.nextLine();
		   count++;
		   
		} while (!yes.equals("y")&&!yes.equals("n"));
		System.out.println("Your amout of tries :" + count);
		
	}

}
