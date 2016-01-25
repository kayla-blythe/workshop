import java.util.Scanner;

public class SemesterAvrage {

	public static void main(String[] args) {
	
Scanner keyboard = new Scanner(System.in);	

String studentName;
int num1, num2, num3, num4, average;
		
System.out.print("Students name-->");
studentName = keyboard.nextLine();
System.out.print("1st 6 weeks average-->");
num1 = keyboard.nextInt();
System.out.print("2nd 6 weeks average-->");
num2 = keyboard.nextInt();
System.out.print("3rd 6 weeks average-->");
num3 = keyboard.nextInt();
System.out.print("Final exam grade-->");
num4 = keyboard.nextInt();

average = (num1 + num2 + num3 + num4) / 4;

System.out.println("Average " + average);

System.out.println();

System.out.printf("%-25s%10s%10s%10s%10s%10s%n", "Name", "1", "2", "3", "E", "Avg");
System.out.println("---------------------------------------------------------------------------");
System.out.printf("%-25s%10s%10s%10s%10s%10s%n", studentName, num1, num2, num3, num4, average);
//don't format everything as strings...need to use floating point format for average to make sure data rounds correctly

keyboard.close();
	}

}
