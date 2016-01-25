import java.util.Scanner;
public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Enter side 1 -->");
		num1 = keyboard.nextInt();

		System.out.println("Enter side 2 -->");
		num2 = keyboard.nextInt();

		double a2 = Math.pow(num1, 2);
		double b2 = Math.pow(num2, 2);
		double c2 = (a2 + b2);
		double c = Math.sqrt(c2);
		
		int hypo = (int)Math.round(c);
		
		System.out.println("The hypotenuse of the triangle = " + hypo);
		
		
	}

}
