import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

int integer;

System.out.println("Please enter an integer --> ");
integer = keyboard.nextInt();

int square = integer*integer;
int cube = square*integer;
int fourth = cube*integer;

System.out.println("The square = " + square);
System.out.println("The cube = " + cube);
System.out.println("The fourth power = " + fourth);









keyboard.close();

	}

}
