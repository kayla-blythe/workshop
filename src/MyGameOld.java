
public class MyGameOld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		case 4: //loc switch    
		
			switch(loop)
			{
				case 1:	//loop 1
				{
					if (wrong <= right)
					{
							System.out.println("NEXT LEVEL: A Relieving Discovery");
							System.out.println();
							System.out.println("START: There is a flashlight at your feet, but it appears to be in pretty bad shape. You notice a blinking");
							System.out.println("red light in the corner of the room and make it out to be a camera. Although it is in no way significant, it");
							System.out.println("makes you wonder if you can find a security room that will give you answers.There are 3 doors, 1 on your left");
							System.out.println("(left room), one on the right (right room), and one infront of you (forward room). ");
							
							System.out.print("What will you do next: ");
							String lvl3select = keyboard.nextLine();	
							if (lvl3select.contains("inventory") || lvl3select.contains("check inventory"))
							{
								printInventory();
							}

							else if (lvl3select.contains("pick up") || lvl3select.contains("take")&& lvl3select.contains("flashlight"))
							{
								if (!checkInventory("flashlight"))
								{//pick it up
									stuff[curPos] = "flashlight";//put it in yo inventory yo
									curPos++;
									
									prl("You attempt to turn the flashlight on, but it appears to have no batteries.");
									prl("");
									prl("");
								}
							
							}	
							else if(lvl3select.contains("go backward") || lvl3select.contains("walk backward") || lvl3select.contains("go backwards") || lvl3select.contains("walk backwards") || lvl3select.contains("go back"))
							{
								prl("You've gone back into the room with 3 doors. You can go forward, left or right");
							}//ends go back else if statement
							else if (lvl3select.contains("go left") || lvl3select.contains("walk left") || lvl3select.contains("go to left room"))
							{
								prl("It appears to have once been a conference room. There is an array of both rolly chairs and wooden chairs. There is a small");
								prl("screw driver beneath the table and a few magnets on the white board.");
								prl("");
								prl("");
							
								System.out.print("What will you do next: ");
								String lvl3select2 = keyboard.nextLine();	
								if (lvl3select2.contains("inventory") || lvl3select2.contains("check inventory"))
								{
									printInventory();
								}
								else if (lvl3select2.contains("take screw driver") || lvl3select2.contains("pick up screw driver"))
								{
									if (!checkInventory("screw driver"))
									{//pick it up
										stuff[curPos] = "screw driver";//put it in yo inventory yo
										curPos++;
										
										prl("The screw driver is in your inventory.");
										prl("");
										prl("");
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
									}		
								}//chair taken
								else if (lvl3select2.contains("look"))
								{
									prl("It appears to have once been a conference room. There is an array of both rolly chairs and wooden chairs. There is a small");
									prl("screw driver beneath the table and a few magnets on the white board.");
									prl("");
									prl("");
								}
								else
								{
									prl("That is not a valid option.");
								}
							}//ends go left else if statement	
						
							else if (lvl3select.contains("go right") || lvl3select.contains("walk right") || lvl3select.contains("go to right room"))
							{
								prl("It seems to be a utility room, it is filled with boxes and papers. On the opposite side of the room there is a closet.");
								prl("The door is propped open with a door wedge and inside the closet there is a set of batteries");
								prl("");
								prl("");
								System.out.print("What will you do next: ");
								String lvl3select3 = keyboard.nextLine();	
								if (lvl3select3.contains("inventory") || lvl3select3.contains("check inventory"))
								{
									printInventory();
								}	
						
								else if (lvl3select3.contains("take batteies") || lvl3select3.contains("grab batteries"))
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
											unlocked = true;
											break;
										}	
									}//batteries usedddddd
								}//batteries taken
								else if (lvl3select3.contains("take door wedge") || lvl3select3.contains("grab door wedge"))
								{
									if (!checkInventory("door wedge"))
									{//pick it up
										stuff[curPos] = "";//put it in yo inventory yo
										curPos++;
										
										prl("You now have the door wedge.");
										prl("");
										prl("");
									}		
								}//wedge taken
								else if (lvl3select3.contains("look"))
								{
									prl("");////////////////////////////
									prl("");
									prl("");
									prl("");
								}	
								else
								{
									prl("That is not a valid option.");
								}	
							}//ends go right else if statement	
							else if (lvl3select.contains("go forward") || lvl3select.contains("walk forward") || lvl3select.contains("go to forward room"))
							{
								prl("There is a window ajar that is big enough for you to go through, but you are on the 4th floor and jumping would be suicide.");
								prl("You can not go that way. There is an air vent on the celieng big enough for you to fit through, but it is way to high for you to");
								prl("reach without something to stand on.");
								prl("");
								prl("");
								System.out.print("What will you do next: ");
								String advancing = keyboard.nextLine();	
								*/
							

	}

}
