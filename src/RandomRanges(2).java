
public class RandomRanges {

	public static void main(String[] args) {
		
		int num1, num2, num3, num5, num6, num7, num8, num9;
		double num4,r4, ro4, re4;
		
		num1 = (int)(Math.random()*25);
		num2 = (int)(Math.random()*50 + 50);
		num3 = (int)(Math.random()*201 - 100);
		num4 = (double)(Math.random()*2);
		
	r4 = (num4 * 1000);
	ro4 = Math.round(r4);
	re4 = (ro4 / 1000);	// print out re4 instead of num4 for 4th number
	
		num5 = (int)(Math.random()*26 + 65);
		char c = (char) num5;
		
		num6 = (int)(Math.random()*9000 + 1000);
		num7 = Math.round(num6);
		num8 = (num7 / 1000);
		num9 = (num8 * 1000);
	
	System.out.println("1. Range: 0 to 25 = " + num1);
	System.out.println("2. Range: 50 to 100 = 92" + num2);
	System.out.println("3. Range: -100 to 100 =" + num3);
	System.out.println("4. Range: 0.1 to 1 (real number rounded to 3 decimal places) =" + re4);
	System.out.println("5. Range: A to Z =" + c);
	System.out.println("6. Range: 1000 to 10000 (rounded to nearest thousand) =" + num9);
	
	}

}
