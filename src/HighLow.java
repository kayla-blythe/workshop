
public class HighLow {

	public static void main(String[] args) {

		double [] nums = new double [10];
		double [] up = new double [10];
		double [] down = new double [10];
		double avg = 0;
		
		int ucount = 0;
		int dcount = 0;
		
		System.out.println("These are 10 random real numbers");
		
		for (int i = 0; i < 10; i++){
			
			nums[i] = (double)(Math.random()*100);
			nums[i]= (int)(nums[i] * 100);
			nums[i]/= 100;

			System.out.print(nums[i] + "  ");
			
			avg += nums[i];
		
		}
		
		System.out.println();
		
		avg /= 10;
		
		System.out.println();
		System.out.println("This is the average:  " + avg);
		
		for (int i = 0; i < 10; i++){
			
			if (nums[i] > avg)
				
			{
			
				up[ucount] = nums[i];
				ucount++;
				
			}
			if (nums[i] < avg)
				
			{
			
				down[dcount] = nums[i];
				dcount++;
			
			}
			
		}	
		
		System.out.println();	
		System.out.println("These are the numbers above the average");
		
		
		for (int i = 0; i < ucount; i++){
			
			System.out.print(up[i] + "  ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("These are the numbers below the average");
		
		
		for (int i = 0; i < dcount; i++){
		
			System.out.print(down[i] + "  ");
			
		}
		
	}

}
