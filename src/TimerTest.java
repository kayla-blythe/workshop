
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	
	
	public static void main(String[] args) {
		private static final int setInterval(){
		    if (interval == 1)
		        timer.cancel();
		    return --interval;
		}
		
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Input seconds => : ");
		    String secs = sc.nextLine();
		    int delay = 1000;
		    int period = 1000;
		    timer = new Timer();
		    interval = Integer.parseInt(secs);
		    System.out.println(secs);
		    timer.scheduleAtFixedRate(new TimerTask() {




static int interval;
static Timer timer;



        public void run() {
            System.out.println(setInterval());

        }
    }, delay, period);
}


}