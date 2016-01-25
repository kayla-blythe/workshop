import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

{
	int num1, num2, num3;
	
System.out.println("Enter 1st side");
	num1 = keyboard.nextInt();
System.out.println("Enter 2nd side");
	num2 = keyboard.nextInt();
System.out.println("Enter 3rd side");
	num3 = keyboard.nextInt();
	
		if (num1 == num2 && num2 == num3)
			System.out.println("This is an Equilateral triangle");
		else if(num1 == num2 || num2 == num3 || num1 == num3)
			System.out.println("This is an Isosceles triangle");
		else
			System.out.println("This is a Scalene triangle");
	
}
	}

}
