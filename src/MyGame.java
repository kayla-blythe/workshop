//There is a problem with the levels. needing assistance in order problems *type look*
//BEGONE DEMONS! LEAVE THIS INOCCENT SOUL!!!!
import java.util.*;

public class MyGame {
	static String [] stuff = new String[25]; 
	static int curPos = 0;
		public static void main(String[] args) {
			for (int i = 0; i < stuff.length; i++){
				stuff[i] = " ";
			}
	

			Scanner keyboard = new Scanner(System.in);
		
			System.out.println();
			System.out.println("					**Strange Places**");
			System.out.println();
			System.out.println("You have woken up in an old abandoned insane asylum with no recollection of how you got there.\n You can feel a welt  on the side of your head and your name is very vague to you. You must go room by room to find out how you ended");
			System.out.println("up here, facing many challenges along the way.");


			int wrong2 = 0, right2 = 0, answer = 0;
			int hp = 100;
			int loc = 1;
			int loop = 1;
			int right = 0;
			int wrong = 0;
			int found = -1;
			int location = 1;
			int location2 = 1;
			int taquitos = 1;
			boolean won = false;
			
			
		
			
			
			while (hp > 0 && !won){//starts game 
		
				switch(loc){//determines where you are
		
				case 1:     
					System.out.println();
			
					switch(loop){
					case 1:	
					{
						System.out.println("LEVEL 1: Medical Room (tutorial)");
						System.out.println();
						System.out.println("START: Your head is bleeding very badly and the stench of dry blood lingers on your shirt.");
						System.out.println(" You are handcuffed to one leg of a rusted iron bed and have no idea how long you've been sitting here or how you ");
						System.out.println("got here. There is an old surgical needle just out of your reach but you believe you could use it to pick the lock.");
						System.out.println("In the corner of the room there is a small medical cabinet.");
						System.out.println("*note:* I recommend you lift the bed.");
						System.out.println();
						
						System.out.print("What will you do next: ");
						String selection = keyboard.nextLine();	
						
						if ((selection.contains("lift") || selection.contains("look")) && (selection.contains("bed")) ){
							System.out.println("It is too heavy and slams down with a loud clank but seems more fragile.");
							loop++;
						}
					 
						else if (selection.contains("look")){
							System.out.println("There is a needle out of reach and a medical cabinet near you.");
						}
					
						else {
							System.out.println("I recommend you don't do that it may end poorly for you.");
						}
					
						System.out.println();
					}	
					break;
					
					case 2:
					
						System.out.print("What will you do next: ");
						String selection2 = keyboard.nextLine();	
						
						if (selection2.contains("lift") || selection2.contains("lift") && (selection2.contains("bed")) ){
							System.out.println("it falls and appears much more fragile. you can now break the rusty leg.");
							loop++;
						}	
					
						else if (selection2.contains("look")){
							System.out.println("There is a needle out of reach and a medical cabinet near you. The bed appears fragile.");
						}
					
						else {
							System.out.println("I recommend you don't do that it may end poorly for you.");
						}
					
						System.out.println();
						break;
					case 3:
						System.out.print("What will you do next: ");
						String selection3 = keyboard.nextLine();	
					
						if (selection3.contains("break") || selection3.contains("brake") && (selection3.contains("bar")) ){
							System.out.println("you may pick up the rusty bar.");
							loop++;
						}
						else if (selection3.contains("look")){
							System.out.println("There is a needle out of reach and a medical cabinet near you. The bed appears much more fragile like it may break.");
						}
						
						else {
							System.out.println("I recommend you don't do that it may end poorly for you.");
						}
					
						prl("");
						break;
					case 4:
						System.out.print("What will you do next: ");
						String selection4 = keyboard.nextLine();	
					
						if (selection4.contains("inventory") || selection4.contains("check inventory")){
							printInventory();
						}
						else if (selection4.contains("pick up") || selection4.contains("take") || selection4.contains("bar")){
					
							stuff[curPos] = "bar";
							curPos++;
							loop++; 
							
							prl("You now have the bar");
						}	
					
						else{
							prl("You should look around and see what your up against.");
							loop++;
						}
					
						prl("");
						break;
					case 5:// ISSUESSSSSSSSSSSSSSSSSSSS
						
						System.out.print("What will you do next: ");
						String selection5 = keyboard.nextLine();	
					
						if (selection5.contains("inventory") || selection5.contains("check inventory")){
							printInventory();
						}
					
						else if (selection5.contains("look")){
							prl("You can now either go to the medical cabinet, use the needle to pick the lock, or leave through the door.");
							loop++;
						}
						
						else{
							prl("Don't you want to look around and see what you are up against?");
						}
						
						prl("");
						break;
						
					case 6:
						System.out.print("What will you do next: ");
						String selection6 = keyboard.nextLine();	
		
						if (selection6.contains("look")){
						prl("You can now either go to the medical cabinet, use the needle to pick the lock, or leave through the door.");
							
						}
						else if (selection6.contains("inventory") || selection6.contains("check inventory")){
							printInventory();
						}
							
						else if (selection6.contains("go to") && selection6.contains("medical cabinet") || selection6.contains("cabinet")){
								prl("You are standing in front of the cabinet.");								
								prl("It looks like it is closed tightly. Or loosely. I'm not a carpenter.");
								prl("Just the voice in your head that you trust for some reason.");
								prl("");
								prl("");
								prl("");

								System.out.print("What will you do next: ");
								String words1 = keyboard.nextLine();
								if (words1.contains("open") || words1.contains("cabinet") || words1.contains("medical cabinet")){
									prl("You attempt to open the cabinet but it does not budge at first.");
									prl(" With a great deal of effort you throw the door open and fall to the floor. You can now take the bandages.");								
									prl("");
									prl("");
									prl("");
									System.out.print("What will you do next: ");
									String wordz = keyboard.nextLine();
									if (wordz.contains("pick up bandages") || wordz.contains("take") || wordz.contains("bandages")){
									
										if (!checkInventory("bandages"))
										{//pick it up
											stuff[curPos] = "bandages";//put it in yo inventory yo
											curPos++;
											 	
											prl("you now have the bandages, I suggest you use them or you may have a bad time.");
											
											//*********USING AN OBJECT****************
											prl("");
											prl("");
											prl("");
											System.out.print("What will you do next: ");
											String wordz2 = keyboard.nextLine();	
											if (wordz2.contains("use") && wordz2.contains("bandages")){
												
												found=searchInv("bandages");
											
												if (found >= 0)
												{
													stuff[found] = "";
											
													prl("you have used the bandages. Try finding a way out of the room.");
												}
											
												else if(wordz2.contains("look")){
													prl("The only things in the room were the needle, the cabinet and the bed.");
												}  
											
												else
												{
													hp -= 10;
													prl("You have lost 10 health for making poor decisions... next time try using the bandages");
													prl("HEALTH = 90");
												}
											
											}
									
										}
											
									}
								else
								{
									hp -= 10;
									prl("You have lost 10 health for making poor decisions... next time try using the bandages");
									prl("HEALTH = 90");	
								}
								}//ends open cabinet
								 
						}//ends bandages loop
							else if (selection6.contains("door")){
								prl("The door will not open until you complete the tutorial... Try something else.");
							}
							else if (selection6.contains("grab needle") || selection6.contains("take needle")){
								prl("You need to go to the needle before you can take it");
							}
							else if (selection6.contains("go") && selection6.contains("needle")){
								prl("The needle is here");
								prl("");
								prl("");
								prl("");
								if (selection6.contains("look")){
									prl("that would be good to use to free your hands.");
								}
								System.out.print("what will you do next: ");
								String wordz4 = keyboard.nextLine();
								if (wordz4.contains("pick up needle") ||(wordz4.contains("take") && wordz4.contains("needle"))){
									
									if (!checkInventory("needle")){//pik it up
										stuff[curPos] = "needle";//put it in yo inventory yo
										curPos++;
								
								
										prl("You now have the needle. You should try picking the locks on your handcuffs.");
										prl("");
										prl("");
										prl("");
										//*********USING AN OBJECT****************
										System.out.print("What will you do next: ");
										String wordz5 = keyboard.nextLine();	
										if (wordz5.contains("use") && wordz5.contains("needle") || (wordz5.contains("pick") && wordz5.contains("lock"))){
												
											boolean unlocked = false;
											found=searchInv("needle");
											if (found >=0)
											{
												stuff[found] = "";
												prl("The needle breaks in half a split second after you use the needle to pick the lock.");
												prl("The door opens with a bit of force and you continue on your quest to find some answers.");
												prl("");
												unlocked = true;
												loop = 1;
												loc++;
												break;
											}
											
											else{
												prl("You should look around and find some solutions to get out of this room.");	 		
											}
										}
									}
								}	
							}
					}//end of medical room switch
					
						
			
					prl("");
					break;
		///////////////////////////end medical room case
				case 2:     //loc==2
					switch(loop){
					case 1:	
					{
						System.out.println("LEVEL 2: The Hallway");
						System.out.println();
						System.out.println("START: You step out into a dark hallway and struggle to see. When your vision focuses");
						System.out.println("you faintly see a figure at the end of the hallway. Its eyes glow a deep red and it appears ");
						System.out.println("to be holding some kind of doll. ");
				
						System.out.println();
						prl(" You will go through series of timed events being prompted to use the necessary actions ");
						prl(" in order to be guided through the trashed hallway. You have 30 seconds to read each section and make a decision.");
						prl(" If time runs out the figure finds you and you will restart at the beginning of the level.");
						System.out.println("up = 1");
						System.out.println("down = 2");
						System.out.println("left = 3");
						System.out.println("right = 4");
				
				
				
						long end = System.currentTimeMillis()+70000;
						
						while (end > System.currentTimeMillis()&& loop==1){
				
							prl("You come across a fallen file cabinet, it lays diagonal across the hallway.");
							System.out.println();
							prl("Type 1 in order to jump over it (quicker), type 2 in order to crawl under the fallen file cabinet(safer).");
							String selection7 = keyboard.nextLine();
							
							if (end <= System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
							}
							
							else if (selection7.equals("1")){
								wrong++;
								loop++;
								hp-=5;
								prl("the file cabinet fell to the ground and you pull yourself back up to your feet.");
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
							}
					 	
							else if (selection7.equals("2")){
								right++;
								loop++;
								prl("you crawl safely beneath the cabinet.");
								prl("");
							}	
						}
				
						prl("");
						break;
					}//end case
				
					case 2:	
					{
						long end = System.currentTimeMillis()+30000;
				 
						while (end > System.currentTimeMillis()&& loop==2){
							prl("There is an open door to your left leading into a lit corridor and a closed door is to your right.");
							System.out.println();
							prl("type 3 in order to go left through the open door, type 4 in order to go right through the closed door.");
							
							String selection8 = keyboard.nextLine();	
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								}
							
							else if (selection8.equals("4")){
								wrong++;
								loop++;
								hp-=5;
								prl("The hallway is dark and you can not proceed without a light source. You turn around ang go left.");
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
							}
							else if (selection8.equals("3")){
								right++;
								loop++;
								prl("you go through the door.");
								prl("");
							}
						}
				
						prl("");
						break;
					}//end case
					
					case 3:	
					{	
						long end = System.currentTimeMillis()+30000;
					 
						while (end > System.currentTimeMillis()&& loop==3){
							prl("The hallway dead ends into 2 doors, under the left one you can tell the floor is water logged and appears to be fragile.");
							System.out.println();
							prl("type 3 in order to go left through the fragile door, type 4 in order to go right through the other door.");
							
							String selection9 = keyboard.nextLine();
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								}
								
							else if (selection9.equals("3")){
								wrong++;
								loop++;
						 		hp-=5;
						 		prl("You went through the left door but the floor is too brittle to walk on, you turn around and go through the right door.");
						 		prl("You lost health. *HEALTH = " + hp + " *");
						 		prl("");
							}
						 	else if (selection9.equals("4")){
						 		right++;
						 		loop++;
						 		prl("you went through the right door.");
						 		prl("");
						 	}
						}
					
						prl("");
						break;
					}//end case
						
					case 4:	
					{
					
						long end = System.currentTimeMillis()+30000;
					 
						while (end > System.currentTimeMillis()&& loop==4){
							prl("There is a surgical bed that stretches completely across the hallway, some broken metal hangs beneath it.");
							System.out.println();
							prl("type 1 in order to go over the surgical bed, type 2 in order to go beneath the surgical bed.");
							
							String selection10 = keyboard.nextLine();	
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								}
							
							else if (selection10.equals("2")){
								wrong++;
								loop++;
								hp-=5;
								prl("The metal beneath the bed snaggs your shirt and you must free yourself before continuing.");
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
							}
							else if (selection10.equals("1")){
								right++;
								loop++;
								prl("You go safely over the bed and continue running.");
								prl("");
							}
						}
					
						prl("");
						break;
				
					}//end case
				
					case 5:	
					{
					
						long end = System.currentTimeMillis()+30000;
					 
						while (end > System.currentTimeMillis()&& loop==5){
							prl("A fallen support beam  hangs diagonal across the pathway. You could go over it to save time, but you do not know if it is too high.");
							System.out.println();
							prl("type 1 in order to go over the support beam, type 2 in order to go beneath it.");
							
							String selection11 = keyboard.nextLine();
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								}
							
							else if (selection11.equals("1")){
								wrong++;
								loop++;
						 		hp-=5;
						 		prl("The beam is too high for you successfully go over... you are not a ninja you know?");
						 		prl("You lost health. *HEALTH = " + hp + " *");
						 		prl("");
							}
							else if (selection11.equals("2")){
								right++;
								loop++;
								prl("You crawl beneath the pole and continue forward.");
								prl("");
							}
						}
					
						prl("");
						break;
					
					}//end case
				
					case 6:
					{
					
						long end = System.currentTimeMillis()+30000;
					 
						while (end > System.currentTimeMillis()&& loop==6){
							prl("The hallway dead ends and splits to the left boxes are piled up but may be an obstacle to your advantage, to the right is a clear pathway.");
							System.out.println();
							prl("Type 3 to go left through the boxes, type 4 to go right down the clear hallway.");
							
							String selection12 = keyboard.nextLine();
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								
								}
							
							else if (selection12.equals("3")){
								wrong++;
								loop++;
								hp-=5;
								prl("You stumble against the numerous boxes blocking your path, but scramble back to your feet.");
						 		prl("You lost health. *HEALTH = " + hp + " *");
						 		prl("");
							}
							else if (selection12.equals("4")){
								right++;
								loop++;
								prl("You chose the clear path and safely continue.");
								prl("");
							}
						}
					
						prl("");
						break;
					
					}//end case
					case 7:
					{
						
						long end = System.currentTimeMillis()+30000;
						
						while (end > System.currentTimeMillis()&& loop==7){
							prl("An array of things have been piled up on to of a table but you think you can throw the things to the floor and obstruct the pathway.");
							System.out.println();
							prl("Type 1 to throw the things to the floor and go over the table, type 2 to go under it.");
							
							String selection13 = keyboard.nextLine();	
							
							if (end < System.currentTimeMillis()){
								prl("You have run out of time!!");
								hp-=5;
								loop++;
								wrong++;
								prl("You lost health. *HEALTH = " + hp + " *");
								prl("");
								}
								
							else if (selection13.equals("2"))
							{
								wrong++;
								hp-=5;
								loop = 1;
								loc++;
								prl("There were things behind the table that obstruct your pathway and prevent you from passing beneath it.");
								prl("You lost health. * HEALTH = " + hp + " *");
								prl("");
							}
							else if (selection13.equals("1"))
							{
								right++;
								loop = 1;
								loc++;
								prl("You throw the objects to the floor .");
								prl("");
								
						
							}	 
						break;
						
					}//while
				
					}// end case 7

					}// end main switch
					break;//end of loc 2 case GO TO CASE 3
				
				case 3:     
					///////////////////////////thus the infinite loop begunith
					while (wrong > right)
					{
						switch(loop)
						{
						case 1:	
						
							
							
								prl("You have escaped. You stand still for a moment, wondering what had just happened. Suddenly the floor falls out from under you");
								prl("The extreme darkness overwhelms you and your heartbeat raises to a fatal rate. Almost instantly you feel dizzy and pass out.");
								prl("");
								prl("");
								prl("");
								System.out.println("LEVEL 3: The Dark Room");
								System.out.println();
								System.out.println("START: When you wake up you are in a cramped, rusty cage with little room for any kind of movement.");
								System.out.println("You squint at the lack of light and fuzzy surroundings. When you come to, you realize you are almost 5 ");
								System.out.println("feet above the ground. The only thing you can see is a surgical bed.");
						
								System.out.print("What will you do next: ");
								String select2 = keyboard.nextLine();	
							if (select2.contains("look"))
							{
									prl("You are in a rusty cage held up by a chain and have very little room. All you can see is a surgical bed.");
							}
							else if (select2.contains("swing") || select2.contains("rock")&& select2.contains("right")|| select2.contains("left")|| select2.contains("backward")|| select2.contains("forward"))
							{
								prl ("rocking back and fourth appears to be doing something but it may take a little more effort");
								
								System.out.print("What will you do next: ");
								String selectAgain = keyboard.nextLine();	
								
								if (selectAgain.contains("swing") || selectAgain.contains("rock")&& selectAgain.contains("right")|| selectAgain.contains("left")|| selectAgain.contains("backward")|| selectAgain.contains("forward"))
								{
									prl("The cage unhooks and the surgical bed braces your fall... You are essentially unharmed.");
									prl("There is a door to your left that has light shining behind it. There is a camera to your right with a small, blinking, red light ");
									prl("and directly in front of you is a cabinet.");
									loop++;
									
								}	
						
								else if (select2.contains("inventory") || select2.contains("check inventory"))
								{
									printInventory();
								}
							}// ends swing rock
							
					
					break;//case 1 end
					
					case 2:
					{
						//////////no its not...
					System.out.print("What will you do next: ");
					String select4 = keyboard.nextLine();
					
						if (select4.contains("inventory") || select4.contains("check inventory"))
						{
							printInventory();
						}

						else if (select4.contains("door"))
						{
							prl("The door is locked.");
						}	
						else if (select4.contains("camera"))
						{
							prl("There is nothing intriguing about this camera but it makes you wonder if it can help give you answers.");
						}	
						else if (select4.contains("cabinet"))
						{
							prl("You open the cabinet and inside is a key.");
							System.out.print("What will you do next: ");////////key in inventory
							String wordzAgain = keyboard.nextLine();

							if(wordzAgain.contains("pick up") || wordzAgain.contains("take")&& wordzAgain.contains("key"))
							{
								if (!checkInventory("key"))
								{//pick it up
									stuff[curPos] = "key";//put it in yo inventory yo
									curPos++;
									
									prl("You now have the key. You walk over to the door. ");
									prl("");
									prl("");
									
								System.out.print("What will you do next: ");////////key in inventory
								String wordz9 = keyboard.nextLine();

								if (wordz9.contains("use") && wordz9.contains("key") || wordz9.contains("unlock") && wordz9.contains("door"))
								{
									
									boolean unlocked = false;
									found=searchInv("key");
									if (found >= 0)
									{
										
										stuff[found] = "";
										prl("You have unlocked the door");
										prl("");
										unlocked = true;
										wrong = 0;
										right = 2;	
										loop = 1;
										
										break;
										
									}//unlock key	
									
							}//use key
									else if (wordz9.contains("go to door") || wordz9.contains("walk to door"))
									{
										prl("You need to unlock the door");
										
									}
							}//take key
							
						}//picking it up (key)
						else
						{
							prl("You should really take the key.. I imagine you don't want to stay here forever, try going back to the cabinet.");
							
						}
											/*        		TO DO:
											1.) hire exterminator - to rid my bugs
											2.) hire priest - to rid my demons
											3.) fix infinite loop
											4.) change while to if (wrong <= right) = wrong = 0 first
											5.) be able to play through 
											6.) cri so hrd ),:
											*/
						
						}//ends cabinet if/else statement
						
					}//end switch loop case 2
					
					/////////////////////////////////////////
					}//ends main switch
					}// ends while loop
					loc++;// exterminator hired... thank you duderstat
					break;
					
				
				case 4: //loc switch    
				
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
							prl("It appears to have once been a conference room. There are numerous rolly chairs around the table. There is a small");
							prl("screw driver beneath the table and a door wedge props the door open to your right.");
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
							else if (lvl3select2.contains("take wedge") || lvl3select2.contains("pick up wedge")|| lvl3select2.contains("pick up door wedge")|| lvl3select2.contains("pick up door wedge"))
							{
								if (!checkInventory("wedge"))
								{//pick it up
									stuff[curPos] = "wedge";//put it in yo inventory yo
									curPos++;
									 	
									prl("The door wedge is in your inventory.");
									prl("");
									prl("");
									location++;
									
								}		
							}//magnet taken
							else if (lvl3select2.contains("take rolly chair") || lvl3select2.contains("pick up rolly chair") || lvl3select2.contains("take chair")|| lvl3select2.contains("pick up chair"))
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
							/*
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
								*/
							else if (lvl3select2.contains("look"))
							{
								prl("It appears to have once been a conference room. There are numerous rolly chairs around the table. There is a small");
								prl("screw driver beneath the table and a door wedge props the door open to your right.");
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
						prl("There is a door directly to your right and you have all the items you need.");
						loop++;
						prl("");
						
						}//ends go left else if statement	
					break;
						
					
						
					case 3:	
					{
						System.out.print("What will you do next: ");
						String lvl3select = keyboard.nextLine();	
						if (lvl3select.contains("inventory") || lvl3select.contains("check inventory"))
						{
							printInventory();
						}
						else if (lvl3select.contains("go right") || lvl3select.contains("walk right") || lvl3select.contains("go to right room"))
						{
							System.out.println();
							prl("It seems to be a utility room, it is filled with boxes and papers. On the opposite side of the room there is a closet.");
							prl("You decide to go to it, inside the closet there is a set of batteries.There is a door directly in front of you.");
							
							prl("");
							
							while (location2 == 1)
							{
								System.out.print("What will you do next: " );
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
						
								else if (selection3.contains("take batteries") || selection3.contains("grab batteries")|| selection3.contains("pick up batteries"))
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
											prl("You are standing in front of the door that was directly in front of you when you walked into the room.");
											System.out.print("What will you do next:");
											
											loop++;
											
										}	
									
									}//batteries usedddddd
								
								}//batteries taken
								/*
								else if (selection3.contains("take door wedge") || selection3.contains("grab door wedge")|| selection3.contains("grab wedge")|| selection3.contains("take wedge"))
								{
									if (!checkInventory("door wedge"))
									{//pick it up
										stuff[curPos] = "";//put it in yo inventory yo
										curPos++;
										
										prl("You now have the door wedge.");
										prl("");
										prl("");
										location2++;
									}		
							
								}//wedge taken
								prl("");											
								*/
								
							}//while location
							
						}//end turn right
						else {
							prl("that is not a thing you can do");
						}
						/*
						prl("You are standing in front of the door that was directly in front of you when you walked into the room.");
						System.out.print("What will you do next:");
						
						loop++;
						*/
					}//end case
					break;
					case 4:
						
						String selection4 = keyboard.nextLine();
						if (selection4.contains("inventory") || selection4.contains("check inventory")){
							printInventory();
						}
						else if (selection4.contains("go forward") || selection4.contains("walk forward") || selection4.contains("go to forward room"))
						{
							prl("There is a window ajar that is big enough for you to go through, but you are on the 4th floor and jumping would be suicide.");
							prl("You can not go that way. There is an air vent on the celieng big enough for you to fit through, but it is way to high for you to");
							prl("reach without something to stand on.");
							prl("");
							prl("");
							System.out.print("What will you do next:");
							String advancing = keyboard.nextLine();	
							if (advancing.contains("inventory") || advancing.contains("check inventory")){
								printInventory();
							}
							else if (advancing.contains("use") || advancing.contains("place") && advancing.contains("rolly chair") || advancing.contains("chair"))
									{
										boolean unlocked = false;
										found=searchInv("rolly chair");
										if (found >= 0)
										{
											
											stuff[found] = "";
											prl("You placed the chair beneath the air vent, however you lost balance and fell to the floor.. didn't your mother");
											prl("ever tell you not to stand on a rolly chair. You set it back up and very carefully stand on it. The vent appears to be");
											prl("screwed on tightly.");
											prl("");
											unlocked = true;

											///////////use screwdriver
											System.out.print("What will you do next: ");
											String advancing1 = keyboard.nextLine();	
											if (advancing1.contains("use screwdriver")|| advancing1.contains("use screw driver"))
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
									
									}//if rolly chair placed end
									else if (advancing.contains("use") || advancing.contains("place") && advancing.contains("wooden"))
									{
										boolean unlocked = false;
										found=searchInv("wooden chair");
										if (found >= 0)
										{
											
											stuff[found] = "";
											prl("You placed the chair beneath the air vent, its legs are uneven but it is sturdy enough to stand on");
											prl("long enough to do what needs to be done");
											prl("");
											prl("");
											unlocked = true;

											///////////use screwdriver
											System.out.print("What will you do next: ");
											String advancing1 = keyboard.nextLine();	
											if (advancing1.contains("use screwdriver") || advancing1.contains("use screw driver"))
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
										}	//used wooden chair	
									
									}//if wooden chair placed end
								}//ends go forward else if statement
						
							}//ends switch loop
					
		
			prl("");
			break;
		//SKIPPING HERE WHY?
			case 5:
				switch(loop)
				{
					case 1:	
					{
					prl("You feel a slight current as you make your way through the vent. Suddenly a fan spinning quickly stops you dead in your tracks");
					prl("");
					prl("");
					System.out.print("What will you do next: ");
					String fan = keyboard.nextLine();
					
					if (fan.contains("inventory") || fan.contains("check inventory"))
					{
						printInventory();
					}
					/*
					else if (fan.contains("door wedge"))
					{
						boolean stopped = false;
						found=searchInv("wedge");
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
							break;
							
						}
					}//used wedge
					*/
					else if (fan.contains("wedge"))
					{
						boolean stopped = false;
						found=searchInv("wedge");
						if (found >= 0)
						{
							
							stuff[found] = "";
							prl("You carefully place the door wedge between the rotating fan blades...");
							prl("It stops almost instantly and you are able to continue.");
							
							prl("");
							stopped = true;
							loc++;
							break;
						}
					}//used wedge
					else
					{
						prl("You need something that will stop the fan... unless you want to end up looking like catdog...");
						prl("in that case go right ahead.");
					}
					}//end case 1
					break;
				}//end switch(loop) 
				prl("");
				break;
	case 6:     
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
				prl("crew of men that look eerily familiar. You begin a search through the massive building. Although ");
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
				loop = 1;
				break;
			}
		
		}//end case
	
			prl("");
			break;
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
				loop++;

			}
			else if(answer2.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}
			
			
		}//end case
		prl("");
			break;
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
				loop++;
			}
			else if(answer3.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}	
			
		}//end case
			break;
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
				loop++;
			}
				
			else if(answer4.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}	
			
		}//end case
prl("");
			break;

		case 5:	
		{
			String answer5 = keyboard.nextLine();
			
			if (answer5.contains("yes"))
			{
				prl("The video transitions into static but in small bursts of video you can make out what appears ");
				prl("to be a riot. They are dragging someone, no they are dragging you. ");
				prl("");
				prl("Will you continue to watch?... yes or no");
				loop++;
				
			}
			
			else if(answer5.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}	
		
			
		
		}//end case
prl("");
			break;
		case 6:
		{
			String answer6 = keyboard.nextLine();
			
			if (answer6.contains("yes"))
			{
				prl("The next burst shows you in an electric shock therapy chair, lethargic and nearly unconscious. ");
				prl("");
				prl("Will you continue to watch?... yes or no");
				loop++;
				
			}
			else if(answer6.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}					
		
		}//end case
		
			prl("");
			break;
		
		case 7:
		{
			String answer7 = keyboard.nextLine();
			
			if (answer7.contains("yes"))
			{
				prl("The next video shows 3 or 4 patients beating you senseless. With a hard whack to the head ");
				prl("you fall to the ground and begin to panic before losing consciousness again.");
				prl("");
				prl("Will you continue to watch?... yes or no");
				loop++;
				
			}
			else if(answer7.contains("no"))
			{
				prl(" You decide it is probably for the best that you don’t find out the truth. ");
				loc++;
				loop = 1;
				break;
			}						
			
			
		}
		prl("");
			break;
	case 8:
	{
		String answer8 = keyboard.nextLine();
		
		if (answer8.contains("yes"))
		{
			prl("You go to the next video of you in it. and 23 more after that all of which shows that you are ");
			prl("handcuffed to that same bed that you woke up beside earlier this evening. You have been dazed for ");
			prl("nearly 2 years rotting alongside this decrepit building. This is the end of the series of videos… ");
			loc++;
			loop =1;
			
		}
		else if(answer8.contains("no"))
		{
			prl(" You decide it is probably for the best that you don’t find out the truth. ");
			loc++;
			loop = 1;
		}						
		
	
	}
		prl("");
		break;
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

			loop=1;
			loc++;
			break;
		case 2:  
			System.out.println("  You chose number 2");
			wrong2++;

			loop=1;
			loc++;
			break;
		case 3:   
			System.out.println("  You chose number 3");
			wrong2++;

			loop=1;
			loc++;
			break;
		case 4:  
			System.out.println("  You chose number 4");
			right2++;
			
			loop=1;
			loc++;
			break;
		}
		}
		}
	break;
		case 8:     
			
			switch(loop){
			
			case 1:	
			{
				while (taquitos == 1)
				{
				System.out.println(".  .  .  Well..  I.. I guess I.. no. NO. I realize now that I was wrong John. You are a terrible man. ");
				System.out.println("You killed my wife and now I will get payback…");
				prl("");
				prl("What do you do? Will you fight back? type either rusty pipe, flashlight, fists, or wise words if ");
				prl("you want to fight back. Type run if you want to spare your old friend.");
				prl("");
				taquitos = 2;
				}
				while (taquitos ==2)
				{
				System.out.println("Type what you choose to do >> ");
				String imHappySad = keyboard.nextLine();
				if (imHappySad.contains("rusty pipe") || imHappySad.contains("flashlight") || imHappySad.contains("fists") || imHappySad.contains("fist"))//|| 
				{
					prl("Harold I don’t want to hurt you but I do want to leave. You");
					prl("deliver a large blow to his head leaving him dead on the ground. I’m sorry I had to do this, you say ");
					prl("beneath your breath. You close his eyes and you walk through the doors and down the long road. ");
					prl("Rain pelts your face and mixes with the freezing oregon air. A man in a car offers to pick you up. ");
					prl("Congratulations you beat the game! ");
					taquitos++;
				}
		
				else if (imHappySad.contains("wise words"))
				{
					prl("Harold I will not physically fight you… it would be unfair you are an old man. As ");
					prl("Harold had said before he is very sly and great with words. He shames you but lets you leave at ");
					prl("such a pathetic sight. You walk through the doors and down the long road. Rain pelts your face ");
					prl("and mixes with the freezing oregon air. A man in a car offers to pick you up. Congratulations you ");
					prl("beat the game! ");
					taquitos++;
				}
		
				else if (imHappySad.contains("run"))
				{
					prl("You tell your friend you will not fight. You run through the doors and down the long road. ");
					prl("Rain pelts your face and mixes with the freezing oregon air. A man in a car offers to pick you up. ");
					prl("Congratulations you beat the game! ");
					taquitos++;
				}
				
				}//taquitos while end

			}//end case 
			break;
		}//end switch
			break;
	}// end case
		
	}//end of hp while


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

