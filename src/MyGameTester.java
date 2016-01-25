import java.util.*;


public class MyGameTester {
	static String [] stuff = new String[15]; 
	static int curPos = 0;


	public static void main(String[] args) {
		for (int i = 0; i < stuff.length; i++){
			stuff[i] = " ";
		}


		Scanner keyboard = new Scanner(System.in);
	
	
		

		int wrong2 = 0, right2 = 0, answer = 0;
		int hp = 100;
		int loc = 1;
		int loop = 1;
		int right = 0;
		int wrong = 0;
		int found = -1;
		int location = 1;
		int location2 = 1;
		boolean won = false;
		
		
	
		
		
		while (hp > 0 && !won){//starts game 
	
			switch(loc){//determines where you are
	
			case 1:     
				System.out.println();
		
				switch(loop){
				case 1:	
				{
					System.out.println("NEXT LEVEL: A Relieving Discovery");
					System.out.println();
					System.out.println("START: There is a flashlight at your feet, but it appears to be in pretty bad shape. You notice a blinking");
					System.out.println("red light in the corner of the room and make it out to be a camera. Although it is in no way significant, it");
					System.out.println("makes you wonder if you can find a security room that will give you answers.There is a single door to your left.");
					System.out.println("");
					
					System.out.print("What will you do next: ");
					String lvl3select = keyboard.nextLine();	
					if (lvl3select.contains("inventory") || lvl3select.contains("check inventory"))
					{
						printInventory();
					}
					
					else if(lvl3select.contains("pick up") || lvl3select.contains("take")&& lvl3select.contains("flashlight"))
					{
						if (!checkInventory("flashlight"))
						{//pick it up
							stuff[curPos] = "flashlight";//put it in yo inventory yo
							curPos++;
							
							prl("You attempt to turn the flashlight on, but it appears to have no batteries.");
							prl("");
							prl("");
							loop++;
						}
					
					}					 
					else if (lvl3select.contains("look")){
						System.out.println("There is a flashlight and 3 doors. One to your left, one to your right, and one in front of you.");
					}
				
					else {
						System.out.println("I recommend you take the flashlight you will need it.");
					}
				
					System.out.println();
				}	
				break;
				
				case 2:
				
					System.out.print("What will you do next: ");
					String selection2 = keyboard.nextLine();	
					
					if (selection2.contains("go left") || selection2.contains("walk left") || selection2.contains("go to left room"))
					{
						prl("It appears to have once been a conference room. There is an array of both rolly chairs and wooden chairs. There is a small");
						prl("screw driver beneath the table and a few magnets on the white board. There is a door to your right.");
						prl("");
						prl("");
					while (location <= 3)
					{
						System.out.print("What will you do next: ");
						String lvl3select2 = keyboard.nextLine();	
						if (lvl3select2.contains("inventory") || lvl3select2.contains("check inventory"))
						{
							printInventory();
						}
						else if (lvl3select2.contains("take screw driver") || lvl3select2.contains("pick up screw driver")|| lvl3select2.contains("pick up screwdriver")|| lvl3select2.contains("take screwdriver"))
						{
							if (!checkInventory("screwdriver"))
							{//pick it up
								stuff[curPos] = "screwdriver";//put it in yo inventory yo
								curPos++;
								
								prl("The screwdriver is in your inventory.");
								prl("");
								prl("");
								location++;
								
							}
						}//screw driver taken
						else if (lvl3select2.contains("take magnet") || lvl3select2.contains("pick up magnet"))
						{
							if (!checkInventory("magnet"))
							{//pick it up
								stuff[curPos] = "magnet";//put it in yo inventory yo
								curPos++;
								 	
								prl("The magnet is in your inventory.");
								prl("");
								prl("");
								location++;
								
							}		
						}//magnet taken
						else if (lvl3select2.contains("take rolly chair") || lvl3select2.contains("pick up rolly chair"))
						{
							if (!checkInventory("rolly chair"))
							{//pick it up
								stuff[curPos] = "rolly chair";//put it in yo inventory yo
								curPos++;
								
								prl("You are now carrying around the rolly chair.");
								prl("");
								prl("");
								location++;
								
							}	
						}//chair taken
						else if (lvl3select2.contains("take wooden chair") || lvl3select2.contains("pick up wooden chair"))
						{
							if (!checkInventory("wooden chair"))
							{//pick it up
								stuff[curPos] = "wooden chair";//put it in yo inventory yo
								curPos++;
								 	
								prl("You are now carrying around the wooden chair. You walk slower because it is hard for you to carry the chair.");
								prl("");
								prl("");
								location++;
								
							}		
						}//chair taken
						else if (lvl3select2.contains("look"))
						{
							prl("It appears to have once been a conference room. There is an array of both rolly chairs and wooden chairs. There is a small");
							prl("screw driver beneath the table and a few magnets on the white board.");
							prl("");
							prl("");
						}
						else if (lvl3select2.contains("go right") || lvl3select2.contains("walk right") || lvl3select2.contains("go to right room"))
						{
							prl("Don't you think you should take the items first?");
						}
					
					else
						{
							prl("That is not a valid option.");
						}
						
					}//ends while loop 
					prl("You are standing in front of the door that was to your right.");
					loop++;
					prl("");
					
					}//ends go left else if statement	
				break;
					
				
					
				case 3:	
				{
					System.out.print("What will you do next: here i hope not");
					String lvl3select = keyboard.nextLine();	
					
					if (lvl3select.contains("go right") || lvl3select.contains("walk right") || lvl3select.contains("go to right room"))
					{
						System.out.println();
						prl("It seems to be a utility room, it is filled with boxes and papers. On the opposite side of the room there is a closet.");
						prl("You decide to go to it, the door is propped open with a door wedge and inside the closet there is a set of batteries.");
						prl("There is a door directly in front of you.");
						prl("");
						
						while (location2 <= 2)
						{
							System.out.print("What will you do next: here again" );
							String selection3 = keyboard.nextLine();	
							
							if (selection3.contains("inventory") || selection3.contains("check inventory"))
							{
								printInventory();
							}
					
							else if (selection3.contains("look"))
							{
								prl("It seems to be a utility room, it is filled with boxes and papers. On the opposite side of the room there is a closet.");
								prl("The door is propped open with a door wedge and inside the closet there is a set of batteries");
							}
					
							else if (selection3.contains("take batteries") || selection3.contains("grab batteries"))
							{
								if (!checkInventory("batteries"))
								{//pick it up
									stuff[curPos] = "batteries";//put it in yo inventory yo
									curPos++;
									
									prl("you now have the batteries... You should use them because jeeze is it dark in here... I can hardly hear a thing.");
									prl("just kidding, but seriously use the batteries. ");
									prl("");
								}	
								System.out.print("What will you do next: ");
								String usingStuff = keyboard.nextLine();	
								if (usingStuff.contains("use") && usingStuff.contains("batteries"))
								{	
							
									boolean unlocked = false;
									found=searchInv("batteries");
									if (found >=0)
									{
										stuff[found] = "";
										prl("The light to the flashlight flickers and turns on. it is very dim but somewhat useful.");
										prl("");
										prl("");
										location2++;
										unlocked = true;
										
									}	
								}//batteries usedddddd
						
							}//batteries taken
							else if (selection3.contains("take door wedge") || selection3.contains("grab door wedge")|| selection3.contains("grab wedge")|| selection3.contains("take wedge"))
							{
								if (!checkInventory("door wedge"))
								{//pick it up
									stuff[curPos] = "";//put it in yo inventory yo
									curPos++;
									location++;
									
									prl("You now have the door wedge.");
									prl("");
									prl("");
									location2++;
								}		
						
							}//wedge taken
							prl("");											
							
							
						}//while location
					}//end turn right
					loop++;
				}//end case
				break;
				case 4:
					prl("You are standing in front of the door that was directly in front of you when you walked into the room.");
					System.out.print("What will you do next:");
					String selection4 = keyboard.nextLine();	
				
					if (selection4.contains("inventory") || selection4.contains("check inventory")){
						printInventory();
					}
					else if (selection4.contains("go forward") || selection4.contains("walk forward") || selection4.contains("go to forward room"))
					{
						prl("There is a window ajar that is big enough for you to go through, but you are on the 4th floor and jumping would be suicide.");
						prl("You can not go that way. There is an air vent on the celing big enough for you to fit through, but it is way to high for you to");
						prl("reach without something to stand on.");
						prl("");
						prl("");
						System.out.print("What will you do next:");
						String advancing = keyboard.nextLine();
								if (advancing.contains("use") || advancing.contains("place") && advancing.contains("rolly chair"))
								{
									boolean unlocked = false;
									found=searchInv("rolly chair");
									if (found >= 0)
									{
										
										stuff[found] = "";
										prl("You placed the chair beneath the air vent, however you lost balance and fell to the floor.. didn't your mother");
										prl("ever tell you not to stand on a rolly chair. You set it back up and very carefully stand on it.");
										hp-=5;
										prl("- 5 health due to poor decisions.");
										prl("* HEALTH: " + hp + " *");
										prl("");
										prl("");
										unlocked = true;

										///////////use screwdriver
										System.out.print("What will you do next: ");
										String advancing1 = keyboard.nextLine();	
										if (advancing1.contains("use screwdriver"))
										{
											boolean unscrewed = false;
											found=searchInv("screwdriver");
											if (found >= 0)
											{
												
												stuff[found] = "";
												prl("The vent is screwed on tightly. With some force you budge the rusty screws hold and the vent opens.");
												prl("You jump inside the vent.");
												loop = 1;
												loc++;
												unscrewed = true;
												
											}	
										}//used screwdriver
										else 
										{
											prl("you need to use the screwdriver to successfully open the vent...");
										}
									}	//used rolly chair	
								
								}
								else if (advancing.contains("use") || advancing.contains("place") && advancing.contains("wooden chair"))
								{
									boolean unlocked = false;
									found=searchInv("wooden chair");
									if (found >= 0)
									{
										
										stuff[found] = "";
										prl("You placed the chair beneath the air vent, The legs are uneven and the chair rocks but stays sturdy");
										prl("enough to hold you up long enough for you to do wat you desire.");
										unlocked = true;
										///////////use screwdriver
										System.out.print("What will you do next: ");
										String advancing2 = keyboard.nextLine();	
										if (advancing2.contains("screwdriver"))
										{
											boolean unscrewed = false;
											found=searchInv("screwdriver");
											if (found >= 0)
											{
												
												stuff[found] = "";
												prl("The vent is screwed on tightly. With some force you budge the rusty screws hold and the vent opens.");
												prl("You jump inside the vent.");
												prl("");
												prl("");
												loop = 1;
												loc++;
												unscrewed = true;
											
											}	
										}//used screwdriver
										else 
										{
											prl("you need to use the screwdriver to successfully open the vent...");
										}
									}//used wooden chair	
								
								}//place wooden chair
								else
								{
									prl("You need more things to continue.");
								}	
								
							}//ends go forward else if statement
					
						}//ends switch loop
				
	
		prl("");
		break;
	
		case 2:
			switch(loop)
			{
				case 1:	
				{
				prl("You feel a slight current as you make your way through the vent. Suddenly a fan spinning quickly stops you dead in yuor tracks");
				prl("");
				prl("");
				System.out.print("What will you do next: ");
				String fan = keyboard.nextLine();
				
				if (fan.contains("inventory") || fan.contains("check inventory"))
				{
					printInventory();
				}
				else if (fan.contains("door wedge") || fan.contains("wedge"))
				{
					boolean stopped = false;
					found=searchInv("door wedge");
					if (found >= 0)
					{
						
						stuff[found] = "";
						prl("You carefully place the door wedge between the rotating fan blades...");
						prl("It stops almost instantly and you are able to continue.");
						prl("");
						prl("");
						stopped = true;
						loc++;
						loop = 1;
						
						
					}//fou
				}//used wedge
				
				else if (fan.contains("magnet"))
				{
					boolean stopped = false;
					found=searchInv("magnet");
					if (found >= 0)
					{
						
						stuff[found] = "";
						prl("You atempt to place the magnet between the rotating fan blades. The fan grazes your hand and it begins to bleed.");
						prl("It eventually slows down, and then stops completely.");
						hp -=5;
						prl("You lost 5 health due to poor decisions");
						prl("* HEALTH: " + hp + " *");
						
						prl("");
						stopped = true;
						loop = 1;
						loc++;
					}
				}//used wedge
				else
				{
					prl("You need something that will stop the fan... unless you want to end up looking like catdog...");
					prl("in that case go right ahead.");
				}
				}//end case 1
			}//end switch(loop) 
			prl("");
			break;
case 3:     
	switch(loop)
	{
	case 1:	
	{
		System.out.println("LEVEL 4");
		System.out.println();
		prl("You scramble to your feet and look around. All around you there are monitors ");
		prl("panning through different camera shots. Other than the screens and the door behind you, ");
		prl("there is nothing in the room. A laptop on the desk holds all of the film files… some dating ");
		prl("back to 20 years ago. You decide to go through the video footage to see if you can find any ");
		prl("information. The first time you show up in a film is 2 years ago. *note: reading these will ");
		prl("help you later on.*");
		prl("");
		prl("(You can choose no at any time to stop watching).");
		prl("");
		prl("Will you watch?... yes or no");
		String answer1 = keyboard.nextLine();
		
		if (answer1.contains("yes"))
		{
			prl("the first film shows you come in through the front door of the asylum. The date throws you ");
			prl("off so bad that you double take when you look at it. It dates back to August of 2013. You and a ");
			prl("crew of men that look eerily familiar to you begin a search through the massive building. Although ");
			prl("no one appears to be able to find anything, You continue to search the rest of the building… it is ");
			prl("then that you realize there is a single black screen on one of the monitors that pans through more ");
			prl("completely black screens… this makes you curious.");
			prl("");
			prl("Will you continue to watch?... yes or no");
			loop++;
		}
		else if(answer1.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}
		
		prl("");
		break;
	}//end case

	case 2:	
	{
		String answer2 = keyboard.nextLine();
		
		if (answer2.contains("yes"))
		{	
			prl("you go to the next video that you are in which is almost 2 weeks later. It appears your group  ");
			prl("has more intel of whatever the search was for. You and your team burst assertively through the ");
			prl("door and the patients all begin to panic. You appear to be the leader of this group, barking ");
			prl("commands to the rest of the men that are there with you. The staff becomes outraged at your ");
			prl("uninvited entrance and demand that you leave immediately. ");
			prl("");
			prl(" Will you continue to watch?... yes or no");

		}
		else if(answer2.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}
		
		prl("");
		break;
	}//end case
	
	case 3:	
	{
		String answer3 = keyboard.nextLine();
		
		if (answer3.contains("yes"))
		{	
			
			prl("The next video with you in it is 3 days later. You walk in through the side door and appear ");
			prl("very paranoid. You appear to be sweating and shaky and it seems like you wanted to go unnoticed. ");
			prl("In an act of desperation you search curiously for something…. It now looks like you found what ");
			prl("you were looking for… but why just a door? You creep slowly into a door and shut it behind you. ");
			prl("Almost instantaneously you are kicked out of the room, shunned, and lead through the door with ");
			prl("which you came. ");
			prl("");
			prl(" Will you continue to watch?... yes or no");
		}
		else if(answer3.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}	
		break;
	}//end case
		
	case 4:	
	{
		String answer4 = keyboard.nextLine();
		
		if (answer4.contains("yes"))
		{
			prl("A week later you break through the front door stumbling on your own feet. It appears that ");
			prl("you are under the influence of something and outraged for seemingly no reason. When the staff ");
			prl("comes over to try to calm you you shoot all of them, then follow up with shooting what you ");
			prl("counted was 7 patients… innocent people. You are tazed and brought to the ground. ");
			prl("");
			prl("Will you continue to watch?... yes or no");
		}
			
		else if(answer4.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}	
		prl("");
		break;

	}//end case

	case 5:	
	{
		String answer5 = keyboard.nextLine();
		
		if (answer5.contains("yes"))
		{
			prl("The video transitions into static but in small bursts of video you can make out what appears ");
			prl("to be a riot. They are dragging someone, no they are dragging you. ");
			prl("");
			prl("Will you continue to watch?... yes or no");
			
		}
		
		else if(answer5.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}	
	
		prl("");
		break;
	
	}//end case

	case 6:
	{
		String answer6 = keyboard.nextLine();
		
		if (answer6.contains("yes"))
		{
			prl("The next burst shows you in an electric shock therapy chair, lethargic and nearly unconscious. ");
			prl("");
			prl("Will you continue to watch?... yes or no");
			
		}
		else if(answer6.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}					
	
		prl("");
		break;
	
	}//end case
	
	case 7:
	{
		String answer7 = keyboard.nextLine();
		
		if (answer7.contains("yes"))
		{
			prl("The next video shows 3 or 4 patients beating you senseless. With a hard whack to the head ");
			prl("you fall to the ground and begin to panic before losing consciousness again.");
			prl("");
			prl("Will you continue to watch?... yes or no");
			
		}
		else if(answer7.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
		}						
		
		prl("");
		break;
	}
	
case 8:
{
	String answer8 = keyboard.nextLine();
	
	if (answer8.contains("yes"))
	{
		prl("You go to the next video of you in it. and 23 more after that all of which shows that you are ");
		prl("handcuffed to that same bed that you woke up beside earlier this evening. You have been dazed for ");
		prl("nearly 2 years rotting alongside this decrepit building. This is the end of the series of videos… ");
		loc++;
		
	}
	else if(answer8.contains("no"))
	{
		prl(" You decide it is probably for the best that you don’t find out the truth. ");
		loc++;
	}						
	
	prl("");
	break;
}
}
	

case 7:     
	switch(loop){
	case 1:	
	{
	prl("you walk through the door and a man stares you directly in the eyes. His face is ashy and ");
	prl("he reeks in an unfamiliar stench. His eyes are bright blue, and for some reason it feels like you are ");
	prl("staring through two foggy crystal balls of a fortune teller… it is all very clear now. Flashes of your ");
	prl("memory flood your mind and you begin to apologize to the man. You are crying without meaning ");
	prl("to. However, you can tell he does not pity you. He throws you to the ground and the dust chokes ");
	prl("your weak lungs.");
	

	System.out.println("  Question 1. His eyes don’t budge and stare a hole through you. Do you know who I am?");
	System.out.println();

	System.out.println("    1. Yes");

	System.out.println("    2. No");
	
	System.out.println("    3. Maybe");
	
	System.out.println("    4. I don’t really care");
	System.out.println();
	
	System.out.print("  Which number do you choose--> ");
	answer = keyboard.nextInt();
	

switch(answer)

{
	  case 1:     
	    System.out.println("   You chose number 1");
	    wrong2++;
	    break;
	  case 2:  
	    System.out.println("   You chose number 2");
	    right2++;
	    break;
	  case 3:   
	    System.out.println("   You chose number 3");
	    wrong2++;
	    break;
	  case 4:  
		System.out.println("   You chose number 4");
		wrong2++;
		break;
	
}

	System.out.println("  Question 2. My name is Harold. I’m as old as the building and as sly as a fox. I know you don’t remember ");
	System.out.println("  who I am… Do you know what you did?");
	System.out.println();

	System.out.println("    1. No I don’t");

	System.out.println("    2. Yes, but I’m not telling");

	System.out.println("    3. I went crazy and killed a lot of people");

	System.out.println("    4. All I know is I’ve been here for a long time");
	System.out.println();

	System.out.print("  Which number do you choose--> ");
	answer = keyboard.nextInt();


	switch(answer)

	{
	case 1:     
		System.out.println("  You chose number 1");
	 	wrong++;
	 	break;
	case 2:  
		System.out.println("  You chose number 2");
		wrong++;
		break;
	case 3:   
		System.out.println("   You chose number 3");
		right++;
		break;
	case 4:  
		System.out.println("   You chose number 4");
		wrong++;
		break;

	}
	System.out.println("  Question 3. That is not the answer I was looking for. Let me rephrase it, Do you know what you did to me?");
	System.out.println();

	System.out.println("    1. I robbed your store?...");		

	System.out.println("    2. I killed your cat?");

	System.out.println("    3. I hurt your people?");

	System.out.println("    4. I slapped your mother?");
	System.out.println();

	System.out.print("  Which number do you choose--> ");
	answer = keyboard.nextInt();


	switch(answer)

	{
	case 1:     
		System.out.println("  You chose number 1");
		wrong2++;
		break;
	case 2:  
		System.out.println("  You chose number 2");
		wrong2++;
		break;
	case 3:   
		System.out.println("  You chose number 3");
		right2++;
		break;
	case 4:  
		System.out.println("  You chose number 4");
		wrong2++;
		break;

	}

	System.out.println("  Question 4. You really are clueless aren’t you… You killED MY WIFE! I made you suffer for an eternity… ");
	System.out.println("  You haven’t had any recollection of anything for the past 2 years. Why did you kill her?");
	System.out.println();

	System.out.println("    1. I wasn’t in my right mind… I’m terribly sorry");

	System.out.println("    2. She deserved it…");

	System.out.println("    3. She was pestering me and I don’t like being pestered.");

	System.out.println("    4. I thought she was someone else");
	System.out.println();

	System.out.print("  Which number do you choose--> ");
	answer = keyboard.nextInt();
	

	switch(answer)

	{
	case 1:     
		System.out.println("  You chose number 1");
		right2++;
		break;
	case 2:  
		System.out.println("  You chose number 2");
		wrong2++;
		break;
	case 3:   
		System.out.println("  You chose number 3");
		wrong2++;
		break;
	case 4:  
		System.out.println("  You chose number 4");
		wrong2++;
		break;

	}

	System.out.println("  Question 5. JOHN! You were my best friend… You used to work here with me. I had to kick you out one ");
	System.out.println("  day because you were acting strange… more violent. That is when you decided to shoot up my ");
	System.out.println("  building. These were people you cared about… people you raised. They wanted you dead but I ");
	System.out.println("  couldn't let them kill you… HOW COULD YOU?!");
	System.out.println();

	System.out.println("    1. Harold I’m insensitive… I don’t care");

	System.out.println("    2. I was being corralled and it scared me");

	System.out.println("    3. I was pretending to be a criminal");

	System.out.println("    4. I was crazy… I’ve already told you");
	System.out.println();

	System.out.print("  Which number do you choose--> ");
	answer = keyboard.nextInt();
	

	switch(answer)

	{
	case 1:     
		System.out.println("  You chose number 1");
		wrong2++;
		break;
	case 2:  
		System.out.println("  You chose number 2");
		wrong2++;
		break;
	case 3:   
		System.out.println("  You chose number 3");
		wrong2++;
		break;
	case 4:  
		System.out.println("  You chose number 4");
		right2++;
		break;

	}			

	System.out.println(".  .  .  Well..  I.. I guess I.. no. NO. I realize now that I was wrong John. You are a terrible man. ");
	System.out.println("You killed my wife and now I will get payback…");
	prl("");
	prl("What do you do? Will you fight back? type either rusty pipe, flashlight, fists, or wise words if ");
	prl("you want to fight back. Type run if you want to spare your old friend.");
	prl("");
	System.out.print("  What do you choose to do?...");
	String answerz = keyboard.nextLine();
	if (answerz.contains("rusty pipe") || answerz.contains("flashlight") || answerz.contains("fists") || answerz.contains("fist"))//|| 
	{
		prl("Harold I don’t want to hurt you but I do want to leave. You");
		prl("deliver a large blow to his head leaving him dead on the ground. I’m sorry I had to do this, you say ");
		prl("beneath your breath. You close his eyes and you walk through the doors and down the long road. ");
		prl("Rain pelts your face and mixes with the freezing oregon air. A man in a car offers to pick you up. ");
		prl("Congratulations you beat the game! ");
	}
	
	else if (answerz.contains("wise words"))
	{
		prl("Harold I will not physically fight you… it would be unfair you are an old man. As ");
		prl("Harold had said before he is very sly and great with words. He shames you but lets you leave and ");
		prl("such a pathetic sight. You walk through the doors and down the long road. Rain pelts your face ");
		prl("and mixes with the freezing oregon air. A man in a car offers to pick you up. Congratulations you ");
		prl("beat the game! ");
	}
	
	else if (answerz.contains("run"))
	{
		prl("You tell your friend you will not fight. You run through the doors and down the long road. ");
		prl("Rain pelts your face and mixes with the freezing oregon air. A man in a car offers to pick you up. ");
		prl("Congratulations you beat the game! ");
	}
	
	else
	{
		prl("I am sorry that is not a valid option... Harold would not approve ): ");
	}
	
	

		}//end loop
	}//end switch
}// end case
	
}//end of main loc switch


////////////////OOOOOOHHHHHHHHHH MMMMMMMMMMYYYYYYYYYYYYYY GGGGGGGGGGGGOOOOOOOOOODDDDDDDDDD/////////////////



}//END MAIN REAL 


public static void printInventory(){
prl("Inventory: ");
for(int x = 0; x < stuff.length; x++)
		System.out.println(stuff[x]);
}
public static boolean checkInventory(String thingImLookingFor){
for(int x = 0; x < stuff.length; x++)
		if (stuff[x].contains(thingImLookingFor))
			return true;
return false;
}
public static void prl(String x){
System.out.println(x);
}
public static void pr(String x){
System.out.print(x);
}
public static int searchInv(String s){
//prl("printing array: "+Arrays.toString(stuff));
Arrays.sort(stuff);
return Arrays.binarySearch(stuff,s);
}

}

