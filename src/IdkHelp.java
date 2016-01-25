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
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int [] scores = new int[10];
		scores [0] = 99;
		
		for (int i = 1; i < 10; i += 2){
			System.out.println(scores[i]);
		}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
																																																															
		}

	}
		

