
public class PracticeLoop {

	public static void main(String[] args) {

	for ( int x = 0 ; x<5 ; x++){ // would continue adding 1 to x until it reaches 5
			
			System.out.println("This loop has run" + (x+1) + " times");
		}
	
		int count = 1; // keep outside of loop otherwise x in loop will continue to be 1
		
	for ( double x = 0; x<=9.75 ; x+= 0.75){
	
		System.out.println("This loop has run " + count + "times");
		count++;
		}
	{
	for (int x=20; x>=0; x--){ // counting down instead of up
		
		System.out.println(" Countdown: "+x);
	}
	
	}
	}
}
