import java.util.Scanner;
public class Min_Max {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

int num1, num2, num3, num4, num5, num6, num7;

System.out.println("Enter 1st Integer --> ");
num1 = keyboard.nextInt();
		
System.out.println("Enter 2nd Integer --> ");
num2 = keyboard.nextInt();

System.out.println("Enter 3rd Integer --> ");
num3 = keyboard.nextInt();

System.out.println();

int s1 = Math.min(num1, num2);
int smallest = Math.min(s1, num3);

System.out.println("Smallest number = " + smallest);
		
int b1 = Math.max(num1, num2);
int largest = Math.max(b1, num3);

System.out.print("Largest number = " + largest);

	}

}
