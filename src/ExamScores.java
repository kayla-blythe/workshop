import java.util.Scanner;
public class ExamScores {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int score = 0;   

		int a = 0;     

		int b = 0;     
		
		int c = 0;      

		int d = 0;      

		int f = 0;      

		int total = 0;   
		
		System.out.print("Enter a negetive number to stop this program");
		System.out.println();
		
		do
		{
			System.out.print("Enter Exam Score--> ");
			score =  keyboard.nextInt();
		   total++;
		   
		   if(score >= 90)
			a++;

			 else if(score >= 80)
			   b++;

			 else if(score >= 70)
			    c++;

			 else if(score >= 60)
			    d++;

			 else if(score >= 0 )
			    f++;
		   
		} while  (score >= 0);
						

		System.out.println();
		System.out.println("========================================");
		System.out.println("             Summary Report             ");
		System.out.println("========================================");
		System.out.println("This is how many scores you entered: " + total);
		System.out.println("Number of A's = " + a);
		System.out.println("Number of B's = " + b);
		System.out.println("Number of C's = " + c);
		System.out.println("Number of D's = " + d);
		System.out.println("Number of F's = " + f);
		
	}

}


