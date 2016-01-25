import java.util.Scanner;
	public class LetterGrade {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter a numerical grade--> ");
int grade = keyboard.nextInt();
	
System.out.print("Letter Grade: ");

	if(grade > 97)
	   System.out.println("A+");

	else if(grade > 94)
	   System.out.println("A");

	else if(grade > 90)
	   System.out.println("A-");

	else if(grade > 87)
	   System.out.println("B+");

	else if(grade > 84)
	   System.out.println("B");

	else if(grade > 80)
	   System.out.println("B-");

	else if(grade > 77)
		   System.out.println("C+");

	else if(grade > 74)
		   System.out.println("C");

	else if(grade > 70)
		   System.out.println("C-");

	else if(grade < 70 )
		   System.out.println("F");


	


	}

}
