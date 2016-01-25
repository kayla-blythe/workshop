import java.util.Scanner;
public class HalloweenQuiz {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
int laa = 0, hphg = 0, bk = 0, ptf2 = 0, answer = 0;

System.out.println();
System.out.println();
System.out.println("Which costume should you wear for Halloween?");
System.out.println();
System.out.println("Scenario: You are trapped in a massive house that is tremendously dark and reeks of mildew.");
System.out.println("Your only focus is to escape the house one room at a time. Here is a series");
System.out.println("of questions that will determine who you should dress as for Halloween.");
System.out.println();
		
			
			System.out.println("  Question 1. The darkness overwhelms you, what do you do?");
			System.out.println();
			
				
				
			System.out.println("    1. You feel your way around until you come across some sort of handle.");
			
			
			System.out.println("    2. You’re a wizard duh, just light your way with your wand… LUMOS!");
			
			System.out.println("    3. You slump to the ground and sob… there's no hope you will ever get out.");
			
			System.out.println("    4. You stand there a moment then casually use a flamethrower to light stuff on fire so you can see.");
			System.out.println();
			
			System.out.print("  Which number do you choose--> ");
			answer = keyboard.nextInt();
			
	
		switch(answer)
		
		{
			  case 1:     
			    System.out.println("  You have chosen A");
			    laa++;
			    break;
			  case 2:  
			    System.out.println("  You have chosen B");
			    hphg++;
			    break;
			  case 3:   
			    System.out.println("  You have chosen C");
			    bk++;
			    break;
			  case 4:  
				System.out.println("  You have chosen D");
				ptf2++;
				break;
			
		}
		
		System.out.println();
		System.out.println("  Question 2.  You realize now that the door has a lock on it, what should you do?");
		System.out.println();
		
		System.out.println("    1. You whip out your wand. ALOHOMORA!! The lock breaks off and the door begins to open.");

		
		System.out.println("    2. You reach into your pocket and retrieve you lockpicks to get the door open.");
  

		
		System.out.println("    3. You use a pen and force it into the lock. It miraculously falls to the ground and the door opens.");

		
		System.out.println("    4. You shoot the lock with your shotgun and blast the door knob off as well.");

		System.out.println();
		
		System.out.print("  Which number do you choose--> ");
		answer = keyboard.nextInt();
		
		switch(answer)
		
		{
		
		      case 1:     
			    System.out.println("  You have chosen A");
			    hphg++;
			    break;
			  case 2:  
			    System.out.println("  You have chosen B");
			    laa++;
			    break;
			  case 3:   
			    System.out.println("  You have chosen C");
			    bk++;
			    break;
			  case 4:  
				System.out.println("  You have chosen D");
				ptf2++;
				break;
		
		}
		
		System.out.println();
		System.out.println("  Question 3. You reach the middle of what seems to be a never ending corridor when the lights begin to flicker and die out.");
		System.out.println("              A strange figure appears… What do you do?");
		System.out.println();
		
		System.out.println("    1. There is a small indention hardly big enough for you to squeeze into. You hide in the shadows and the");
		System.out.println("    enemy can’t find you... you are safe.");
		
		System.out.println("    2. You simply put on your invisibility cloak. You are safe.");

		System.out.println("    3. You are far more intimidating than the enemy so it goes away… You are safe");

		System.out.println("    4. You cower in the middle of the hallway. The enemy feel bad for you and you are spared.");


		System.out.println();
		
		System.out.print("  Which number do you choose--> ");
		answer = keyboard.nextInt();
		
		switch(answer)
		
		{
		
	      case 1:     
			    System.out.println("  You have chosen A");
			    laa++;
			    break;
			  case 2:  
			    System.out.println("  You have chosen B");
			    hphg++;
			    break;
			  case 3:   
			    System.out.println("  You have chosen C");
			    ptf2++;
			    break;
			  case 4:  
				System.out.println("  You have chosen D");
				bk++;
				break;
		
		}
		
		System.out.println();
		System.out.println("  Question 4. When you reach the doorway at the end of the hallway it won’t budge.");
		System.out.println("  In a rush it slams open and man with a chainsaw jumps out what do you do?");
		
	System.out.println();
		
		System.out.println("    1. EVANESCO! You use your vanishing spell to make the chainsaw man disappear.");

		System.out.println("    2. You evade every attempt he makes to attack you and he gives up.");

		System.out.println("    3. When the door burst open you fell to the floor. In a hurry you scurried between his legs and ran to the closest hiding spot.");

		System.out.println("    4. You pull out your axe and begin to fight against the chainsaw man. You won and begin to walk again.");

		System.out.println();
		
		System.out.print("  Which number do you choose--> ");
		answer = keyboard.nextInt();
		
		switch(answer)
		
		{
		
	      	case 1:     
			    System.out.println("  You have chosen A");
			    hphg++;
			    break;
			  case 2:  
			    System.out.println("  You have chosen B");
			   laa++;
			    break;
			  case 3:   
			    System.out.println("  You have chosen C");
			    bk++;
			    break;
			  case 4:  
				System.out.println("  You have chosen D");
				ptf2++;
				break;
		
		}
		
		System.out.println();
		System.out.println("  Question 5. Suddenly you fall through a trap door and thud against the cold, damp floor. What do you do?");
		System.out.println();
		
		System.out.println("    1. You perform a judo roll and land safely without harm.");

		System.out.println("    2. You brace your fall and use magic to light the room again");
		
		System.out.println("    3. You slam against the ground and are stunned for a few moments before catching your breath.");

		System.out.println("    4. Your fall is braced by your own body and end up completely unharmed.");

		System.out.println();
		
		System.out.print("  Which number do you choose--> ");
		answer = keyboard.nextInt();
		
		switch(answer)
		
		{
		
	      	case 1:     
			    System.out.println("  You have chosen A");
			    laa++;
			    break;
			  case 2:  
			    System.out.println("  You have chosen B");
			    hphg++;
			    break;
			  case 3:   
			    System.out.println("  You have chosen C");
			    bk++;
			    break;
			  case 4:  
				System.out.println("  You have chosen D");
				ptf2++;
				break;
		
		}

		System.out.println();
		System.out.println("  Question 6. You stand up and dust the dirt off of yourself. You realize there are 2 doors, which door do you choose.");
		
		System.out.println();
				
		System.out.println("    1. You choose the left door.");
		
		System.out.println("    2. You choose the right door.");
		
		System.out.println("    3. You sit, do nothing and cri so hrdd ;( after contemplating whether to continue... You stand up and choose the left door.");
		
		System.out.println("    4. You place C4 on the floor and blow both doors up.");
		

		System.out.println();
				
		System.out.print("  Which number do you choose--> ");
		answer = keyboard.nextInt();
				
			switch(answer)
				
				{
				
		      case 1:     
				    System.out.println("  You have chosen A");
				     hphg++;  
				    break;
				  case 2:  
				    System.out.println("  You have chosen B");
				     laa++;
				    break;
				  case 3:   
				    System.out.println("  You have chosen C");
				    bk++;
				    break;
				  case 4:  
					System.out.println("  You have chosen D");
					ptf2++;
					break;
				
				}
		
			System.out.println();
			System.out.println("  Question 7. When you openned the doors two more doors appear on the other side. What do you do?");
			
			System.out.println();
			
			System.out.println("    1. You chose the right door. You take off your rainbow ascot and wrap the handle. Germs are gross!"); 
		
			System.out.println("    2. You become agitated and burn down both doors in an impatient manner.");
		
			System.out.println("    3. Fus Ro Dah!!!!!!!!!!!!!!!!!!!!!!!!!!! You blow the left door off of the hinges.");
			
			System.out.println("    4. You teleport.");
		
		
			System.out.println();
			
			System.out.print("  Which number do you choose--> ");
			answer = keyboard.nextInt();
					
				switch(answer)
					
					{
					
			      case 1:     
					    System.out.println("  You have chosen A");
					    bk++;  
					    break;
					  case 2:  
					    System.out.println("  You have chosen B");
					    ptf2++;
					    break;
					  case 3:   
					    System.out.println("  You have chosen C");
					    laa++;
					    break;
					  case 4:  
						System.out.println("  You have chosen D");
						hphg++;
						break;
					
					}
		
			System.out.println();
			System.out.println("  Question 8. Axes swing from either side of the hallway... Thank God you made it to the end of that tedious door maze! what do you do?");
		
			System.out.println();
			
			System.out.println("    1. #&!@... This is ridiculous");
			
			System.out.println("    2. *sips tea* god save the queen... * sends owl for help *");
		
			System.out.println("    3. *pulls out compass* wat issss thisssss?");
		
			System.out.println("    4. Dodges the axes!! This is right up your ally.");
			
			System.out.println();
			
			System.out.print("  Which number do you choose--> ");
			answer = keyboard.nextInt();
					
				switch(answer)
					
					{
					
			      case 1:     
					    System.out.println("  You have chosen A");
					    ptf2++;  
					    break;
					  case 2:  
					    System.out.println("  You have chosen B");
					    hphg++;
					    break;
					  case 3:   
					    System.out.println("  You have chosen C");
					    bk++;
					    break;
					  case 4:  
						System.out.println("  You have chosen D");
						laa++;
						break;
					
					}
				

				System.out.println();
				System.out.println("  Question 9. The next door you enter through reveals 30 more of you... or mirrors that is. What do you do?");
				System.out.println();
				
				System.out.println("    1. You run into the mirror and it cracks... you have no idea what to do and sit down.");
		
				System.out.println("    2. You analyze the situation and realize you've never seen yourself in a mirror and parkour your way past the mirrors.");
		
				System.out.println("    3. You shoot each mirror with your shotgun until you find the way out.");
		
				System.out.println("    4. You make the mirrors opaque... *sips more tea*");
				
				System.out.println();
				
				System.out.print("  Which number do you choose--> ");
				answer = keyboard.nextInt();
						
					switch(answer)
						
						{
						
				      case 1:     
						    System.out.println("  You have chosen A");
						    bk++;  
						    break;
						  case 2:  
						    System.out.println("  You have chosen B");
						    laa++;
						    break;
						  case 3:   
						    System.out.println("  You have chosen C");
						    ptf2++;
						    break;
						  case 4:  
							System.out.println("  You have chosen D");
							hphg++;
							break;
						
						}
		
			System.out.println();
			System.out.println("  Question 10. You realize that you have made it to the front door. What decision do you make?");
		
			System.out.println();
			
			System.out.println("    1. You burn the door down then continue to burn the rest of the house down @#$&*#!!!");
		
			System.out.println("    2. You think it's a trick and continue searching for the front door.");
		
			System.out.println("    3. You sneak out of the door and ride Shadow Mere into the moonset.");
		
			System.out.println("    4. You pull out your broom and zap the door open. ");
		
			System.out.println();
			
			System.out.print("  Which number do you choose--> ");
			answer = keyboard.nextInt();
					
				switch(answer)
					
					{
					
			      case 1:     
					    System.out.println("  You have chosen A");
					    ptf2++;  
					    break;
					  case 2:  
					    System.out.println("  You have chosen B");
					    bk++;
					    break;
					  case 3:   
					    System.out.println("  You have chosen C");
					    laa++;
					    break;
					  case 4:  
						System.out.println("  You have chosen D");
						hphg++;
						break;
		
					
					}
				
				
			System.out.println();
			
if (bk == 5)
{
	System.out.println(" The alternate ending (also sorry you failed the quiz… by default Barbie/ Ken");
	System.out.println(" is the costume you should wear…): You are Ken (or Barbie) and have been wandering around");
	System.out.println(" for hours. You have passed the front door 7 times and even the ghosts look at you with that “are ");
	System.out.println(" you kidding me” face. You lost your brush and your hair is a mess. You still have the compass");
	System.out.println(" out but you are using it backwards; honestly it won’t help you anyway but because you don’t"); 
	System.out.println(" actually know what it is you keep it out. Your shoes are ruined and your ascot half tied… Finally"); 
	System.out.println(" you walk out the front door but trip and fall on your own shoelace. As you stand up you realize it"); 
	System.out.println(" was just a dollhouse… Happy Halloween! Thanks for taking my quiz (: "); 

}


else if ( laa >= hphg && laa >= ptf2 && laa >= bk )
{
	System.out.println(" You are Lucien Lachance (or Astrid) from the dark brotherhood. You pride ");  
	System.out.println(" yourself on being the best assassin in all of Tamriel. Not to mention you could probably kill a ");
	System.out.println(" whole army without being seen. You are quick and sneaky and the costume you should pick for ");  
	System.out.println(" Halloween is an assassin.  Thanks for taking my quiz (: ");

}


else if ( hphg > laa && hphg >= ptf2 && hphg >= bk )
{
	System.out.println(" You are Harry Potter or Hermione Granger from Harry Potter. You have ");
	System.out.println(" incredible magic powers and always carry a wand at your side. Put on your cloak because the "); 
	System.out.println(" costume you should wear for Halloween is a wizard.  Thanks for taking my quiz (: ");

}


else if ( ptf2 > hphg && ptf2 > laa && ptf2 >= bk )
{
	System.out.println(" You are Pyro from Team Fortress 2. You are the ultimate powerhouse and");
	System.out.println(" extremely destructive. You are mysterious, wear a gas mask, and never actually talk. Suit up for"); 
	System.out.println(" Halloween because the costume you should wear is Pyro.  Thanks for taking my quiz (: ");

}


else if ( bk > hphg && bk > laa && bk > ptf2 )
{
	System.out.println(" You are Ken (or Barbie) and by far the sassiest of them all. Put on your"); 
	System.out.println(" ascot and try not to stumble on your own feel because it’s Halloween time! You are not the"); 
	System.out.println(" smartest decision maker when it comes to a do or die situation but that’s okay because you will");
	System.out.println(" most likely never have to run for your life in a haunted house. This Halloween you should be the");
	System.out.println(" brattiest character possible!  Thanks for taking my quiz ");
}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
