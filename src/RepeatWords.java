import java.util.Scanner;

public class RepeatWords {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter words, type (stop or exit) to stop");
		System.out.println();
		 String yes =  keyboard.nextLine();
		 
	while (!yes.equals("stop")&&!yes.equals("exit")){
			
			yes =  keyboard.nextLine();
			
		   count++;
		}
		
		System.out.println();
		System.out.println("You entered " + count + " words");
		
	}

}
