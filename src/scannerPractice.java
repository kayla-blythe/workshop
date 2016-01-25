import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

int num1, num2, num3, sum;

System.out.println("Enter 1st number-->");
num1 = keyboard.nextInt();

System.out.println("Enter 2nd number-->");
num2 = keyboard.nextInt();

System.out.println("Enter 3rd number-->");
num3 = keyboard.nextInt();

sum = num1 + num2 + num3;

System.out.println("Number 1 = " + num1);
System.out.println("Number 2 = " + num2);
System.out.println("Number 3 = " + num3);

System.out.println("The total of the number is " + sum);

keyboard.close();
	}

}
