
public class TimesTable {

	public static void main(String[] args) {
		int rows = 10;
		int rowws = 10;
		
		
        for(int r = 1; r <= rows; r++)  
        {
                for(int c = 1; c <= rowws; c++) 
                {
                     System.out.printf("%3d ", c*r);
                }
                System.out.println();
        }
		
	}

}
