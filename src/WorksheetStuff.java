
public class WorksheetStuff {

	public static void main(String[] args) {

	int mon = 8, tues = 7, weds = 8, thurs = 5, fri = 6;
	int totalHours = mon + tues + weds + thurs + fri;
	double payRate = 10.00;
	double weeklyPay = payRate * totalHours;
	
	System.out.printf("%4s%4s%4s%4s%4s%n---------------------%n","M","T","W","Th","F");
		
		System.out.printf("%4d%4d%4d%4d%4d%n", mon, tues, weds, thurs, fri);
		
		System.out.println();
		
		System.out.printf("%-12s:%5d%n", "Total Hours", totalHours);
		
		System.out.printf("%-12s:%5.2f%n", "Pay Rate", payRate);
		
		System.out.printf("%-12s:%5.2f%n", "Total Pay", weeklyPay);
		

	}

}
