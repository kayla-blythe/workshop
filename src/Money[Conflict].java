import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

int num1, num2, num3, num4, totalCents, Dollars, Cents;

System.out.println("How many pennies do you have -->");
num1 = keyboard.nextInt();

System.out.println("How many nickels do you have -->");
num2 = keyboard.nextInt();

System.out.println("How many dimes do you have -->");
num3 = keyboard.nextInt();

System.out.println("How many quarters do you have -->");
num4 = keyboard.nextInt();

int totalp = num1 * 1;
int totaln = num2 * 5;
int totald = num3 * 10;
int totalq = num4 * 25;

totalCents = totalq + totald + totaln + totalp;

Dollars = totalCents / 100;
Cents = totalCents % 100;

System.out.println("Total value is " + Dollars + " dollars and " + Cents + " Cents");


keyboard.close();

	}

}
