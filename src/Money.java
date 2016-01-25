import java.util.Scanner;

public class Money {

 public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

int quarters, dimes, nickels, pennies, totalCents, dollars, cents;

int num1, num2, num3, num4;

System.out.println("How many pennies do you have -->");//use print() instead of println()
num1 = keyboard.nextInt();

System.out.println("How many nickels do you have -->");
num2 = keyboard.nextInt();

System.out.println("How many dimes do you have -->");
num3 = keyboard.nextInt();

System.out.println("How many quarters do you have -->");
num4 = keyboard.nextInt();

int totalq = num4 * 25;
int totald = num3 * 10;
int totaln = num2 * 5;
int totalp = num1 * 1;

totalCents = totalq + totald + totaln + totalp;
dollars = totalCents/100;
cents = totalCents%100;

System.out.println();
System.out.println("total value = " + dollars + " dollars and "  + cents + " cents.");

keyboard.close();

 }

}
