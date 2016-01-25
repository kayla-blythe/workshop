import java.util.Scanner;
	public class ChangeCase {

		public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter words, type \"stop\" to stop");
		System.out.println();
		
		 String yes = "";
		 
			String [] str = new String[20];
			
			int count = 0;
		 
		 while (!yes.equalsIgnoreCase("stop") && !yes.equalsIgnoreCase("stahp"))
			{
			yes =  keyboard.nextLine();	
			str [count] = yes;
			count++;
			}
	 
	System.out.println("These are your words converted into upper case and lower case:");
	System.out.println();
	
		for (int i = 0; i < count-1; i ++)
				{
				System.out.printf("%10s %10s %10s%n", str[i], str[i].toUpperCase(), str[i].toLowerCase());
			//System.out.print(str[i] + "   ");
			
			//System.out.print(str[i].toUpperCase() + "   ");

			//System.out.println(str[i].toLowerCase() + "   ");
				}
	
	
		}

}
