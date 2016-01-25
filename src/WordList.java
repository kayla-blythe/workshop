import java.util.Scanner;
public class WordList {

 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
    
  String [] werdz = new String[10];
  
  System.out.println("Enter 10 words and thet will be displayed on the screen");
  System.out.println();
  
  String yes = keyboard.nextLine();//this first word is not saved to the array...
  
  int count = 0;
  
  for (int i = 0; i < 10; i++){
   
   yes =  keyboard.nextLine(); 
   werdz[count] = yes;
   count++;
   
  }
  
  System.out.println();
  System.out.println("these are your words... You are so welcome (: ");
  System.out.println();
  
  
  for(int i = 0; i < 10; i++){
   
   System.out.println(werdz[i]);

  }
  
  
 }

}
