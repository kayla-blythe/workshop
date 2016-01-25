import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
Scanner keyboard= new Scanner(System.in);

System.out.println("   Menu  ");
System.out.println("=========");

System.out.println();
System.out.println("1. Salad");
System.out.println("2. Hamburger");
System.out.println("3. Pizza");
System.out.println("4. Prezel");
System.out.println("5. Escargot");
System.out.println();
System.out.print("Selection: ");
int selection = keyboard.nextInt();
System.out.println();

switch(selection)

{

  case 1:     
    System.out.println("You have selected Salad");
    break;
  case 2:  
    System.out.println("You have selected Hamburger");
    break;
  case 3:   
    System.out.println("You have selected Pizza");
    break;
  case 4:  
	System.out.println("You have selected Pretzel");
	break;
  case 5:   
	System.out.println("You have selected Escargot");
	break;
	
  default:
    System.out.println("Invalid Selection!");
    break;
}

	
	}

}
