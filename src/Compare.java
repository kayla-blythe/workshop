import java .util.Scanner;
public class Compare {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

int num1, num2;
System.out.print("Enter first number: ");
num1 = keyboard.nextInt();
System.out.print("enter second number: ");
num2 = keyboard.nextInt();

	if(num1 > num2 )
		System.out.println(num1 + " is greater than " + num2);
	else if (num1 < num2)
		System.out.println(num1 + " is less than " + num2);
	else if (num1 == num2)
		System.out.println(num1 + " is equal to " + num2);
	

	}

}
