import java.util.Scanner;

public class Rectangle {

 public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

int length, width;

//use System.out.print() to get the input on the same line as the prompt.
System.out.print("Enter the length -->");
length = keyboard.nextInt();
System.out.print("Enter the width -->");
width = keyboard.nextInt();

int perimeter = length + length + width + width;
int area = length * width;

System.out.println("perimeter = " + perimeter);
System.out.println("are = " + area);

keyboard.close();

 }

}
