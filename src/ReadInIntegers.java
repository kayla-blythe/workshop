import java.util.Scanner;

public class ReadInIntegers {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Enter 1st number -->");
		num1 = keyboard.nextInt();
		System.out.print("Enter 2nd number -->");
		num2 = keyboard.nextInt();
		System.out.print("Enter 3rd number -->");
		num3 = keyboard.nextInt();
		
		int sum;
		sum = num1 + num2 + num3;
		
		System.out.println("the sum of the three numbers is " + sum);
		
		
		
	}

}
