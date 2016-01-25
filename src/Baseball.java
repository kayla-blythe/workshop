
public class Baseball {

	public static void main(String[] args) {

	int hits, atBats, roundedAvg;
	double battingAvg;
	
	hits = 27;
	atBats = 80;
	battingAvg = 0;
	roundedAvg = 0;

	battingAvg = (double) hits / atBats;
	battingAvg += .0005;

	battingAvg *= 1000;
	roundedAvg = (int) battingAvg;
	
	System.out.println("Hits = " + hits);
	System.out.println("At Bats = " + atBats);
	
	System.out.println("------------------------------");
	
	
	System.out.println("Batting Average = " + roundedAvg);
	
	
	}

}
