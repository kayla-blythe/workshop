
public class Averages {

	public static void main(String[] args) {

		int num = 0;
		
		int count = 0;  
		
		int pos = 0; 
		
		int neg = 0;       

		int posSum = 0;     

		int negSum = 0;     

		int posAvg = 0;    

		int negAvg = 0;
		
		do
		{
		num=(int)(Math.random() * 2001) - 1000;
		System.out.println(num);
		count++;
		
		if (num >= 0){
			
			pos++;
			posSum += num;
			
		}
		
		else{
			neg++;
			negSum += num;
			
		}
		
		}while (count <= 99);
		
	
		posAvg = posSum / pos;
		negAvg = negSum / neg;
		
		
		System.out.println();
		System.out.println("             Summary             ");
		System.out.println("=================================");
		
		System.out.println("Number of positive numbers = " + pos);
		System.out.println("Sum of positive numbers = " + posSum);
		System.out.println("Average of positive numbers = " + posAvg);
		System.out.println("Number of negetive numbers = " + neg);
		System.out.println("Sum of negetive numbers = " + negSum);
		System.out.println("Average of negetive numbers = " + negAvg);
		
	}

}
