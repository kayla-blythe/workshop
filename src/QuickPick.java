
public class QuickPick {

	public static void main(String[] args) {

		int num1, num2, num3, num4, num5, num6;
		
		System.out.println("Texas Lottery - Quick Pick");
		System.out.println("==========================");
		
		num1 = (int)(Math.random()*50 + 1);
		num2 = (int)(Math.random()*50 + 1);
		num3 = (int)(Math.random()*50 + 1);
		num4 = (int)(Math.random()*50 + 1);
		num5 = (int)(Math.random()*50 + 1);
		num6 = (int)(Math.random()*50 + 1);
		
		System.out.print(num1 + "   " + num2 + "   " + num3 + "   " + num4 + "   " + num5 + "   " + num6);
	}

}
