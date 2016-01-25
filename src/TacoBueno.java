
public class TacoBueno {

	public static void main(String[] args) {
	
		final double TAXRATE= 0.0875;
		double taco  = .99;
		double burrito = 11.29;
		double muchaco = 1.99;
		double cinnamonChips = .99;
		double largeDrink = 1.89;
		double tax = 0;
		double subTotal = 0;
		
		//this works, but you really want your price column to be wider.  
		//the number before the decimal should indicate the entire width
		//of the column, not just the digits expected before the decimal point in the data
		//%6.2f
	System.out.printf("%-20s%7.2f%n", "Taco", taco);
	System.out.printf("%-20s%7.2f%n", "Burrito", burrito);
	System.out.printf("%-20s%7.2f%n", "Muchaco", muchaco);
	System.out.printf("%-20s%7.2f%n", "Cinnamon chips", cinnamonChips);
	System.out.printf("%-20s%7.2f%n", "Large Drink", largeDrink);
	
	System.out.println("-------------------------------");
	
	subTotal = taco + burrito + muchaco + cinnamonChips + largeDrink;
	tax = subTotal * TAXRATE;
	
	System.out.printf("%-20s%7.2f%n", "Sub total", subTotal);
	System.out.printf("%-20s%7.2f%n", "Tax", tax);
			
	System.out.println("-------------------------------");
	
	System.out.printf("%-20s%7.2f%n", "Grand total", tax + subTotal);
	
	}

}
