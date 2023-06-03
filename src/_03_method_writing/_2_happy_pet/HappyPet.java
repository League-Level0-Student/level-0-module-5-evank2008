package _03_method_writing._2_happy_pet;
import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {
	
	static int happinessLevel = 5;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pronoun = null;
		String cPronoun = null;
		String p2 = null;
		String cP2 = null;
		String q = null;
String petType = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
String petName = JOptionPane.showInputDialog("What do you want to name your new " + petType + "?");
Random ran = new Random();
String food = null;
String ball = null;
boolean sex = ran.nextBoolean();
if(sex) {
	cPronoun = "He";
	pronoun = "he";
	cP2 = "His";
	p2 = "his";
	JOptionPane.showMessageDialog(null, "You got a new pet " + petType + "! It's a boy! \n You decide to name him " + petName + ".");
}
else {
	pronoun = "she";
	p2 = "her";
	cPronoun = "She";
	cP2 = "Her";
	JOptionPane.showMessageDialog(null, "You got a new pet " + petType + "! It's a girl! \n You decide to name her " + petName + ".");
}
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		while(true) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with " + petName + "? \n Happiness: " + happinessLevel, "Playing with " + petName + ", your pet " + petType, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Throw ball", "Feed", "Clean" }, null);

			switch (task) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				//throw ball
				int ballT = ran.nextInt(10);
				switch (ballT) {
				case 0:
					 ball = "a tennis ball";
					break;
				case 1:
					ball = "a ball of yarn";
					break;
				case 2:
					ball = "a meatball";
					break;
				case 3:
					ball = "a bowling ball";
					break;
				case 4:
					ball = "a baseball";
					break;
				case 5:
					ball = "a cake pop without the stick";
					break;
				case 6:
					ball = "a pickled egg";
					break;
				case 7:
					ball = "your neighbor's severed head";
					break;
				case 8:
					ball = "an eyeball";
					break;
				case 9:
					ball = "a ball-peen hammer";
					break;
					
				}
				int ballH = ran.nextInt(7)-3;
				if(ballH>-1) {
				JOptionPane.showMessageDialog(null,"You threw " + ball + " for " + petName + ". \n Happiness + " + ballH);
				}
				else {
					JOptionPane.showMessageDialog(null,"You threw " + ball + " for " + petName + ". \n Happiness " + ballH);
				}
				happinessLevel += ballH;
				break;
			case 2:
				//feed
				
				int foodN = ran.nextInt(10);
				switch (foodN) {
				case 0:
					 food = "a few bread crumbs.";
					 q = "hates them!";
					break;
				case 1:
					 food = "a grape.";
					 q = "sucked the water off of it.";
					break;
				case 2:
					 food = "a particularly stinky bit of cheese.";
					 q = "didn't like it very much...";
					break;
				case 3:
					 food = "a pretzel.";
					 q = "didn't like it very much...";
					break;
				case 4:
					 food = "an ice cube.";
					 q = "didn't like it very much.";
					break;
				case 5:
					 food = "a salt cube.";
					 q = "seemed to like it.";
					break;
				case 6:
					 food = "a generic " + petType + " treat from the bag.";
					 q = "likes it.";
					break;
				case 7:
					 food = "an entire smoked salmon.";
					 q = "likes it!";
					break;
				case 8:
					 food = "a grilled cheese sandwich.";
					 q = "loves it!";
					break;
				case 9:
					 food = "a Scooby Snack. ";
					 q = "loves it!";
					break;
				}
				if(ran.nextInt(10)!=9) {
				if(foodN>3) {
				JOptionPane.showMessageDialog(null,"You gave " + petName + " " + food + "\n" + cPronoun + " " + q
						+ "\n Happiness + " + (foodN-4));
				happinessLevel+=foodN-4;
				}
				else {
					JOptionPane.showMessageDialog(null,"You gave " + petName + " " + food + "\n" + cPronoun + " " + q
							+ "\n Happiness " + (foodN-5));
				
				happinessLevel+=foodN-5;
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Don't you know that " + petType + "s are allergic to those? \n " + petName + "had to go to the hospital and you couldn't afford the medical bills.");
				happinessLevel = 0;
				}
				break;
			case 3:
				//clean
				int cleanLuck = ran.nextInt(5);
				switch (cleanLuck) {
				case 0:
					JOptionPane.showMessageDialog(null,"Right as you managed to stuff " + petName + " in the tub, " + pronoun + " splashed you, jumped out of the tub, and ran off. \n You never heard from " + petName + " again.");
					happinessLevel = 0;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, petName + " didn't like that. " + cPronoun + " spent the whole bath flailing about in the water. \n Happiness -3");
					happinessLevel -=3;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, petName + " wasn't very happy about that. " + cPronoun + " felt a bit more distant after it was done. \n Happiness -2");
					happinessLevel -=2;
					break;
				case 3:
					JOptionPane.showMessageDialog(null, petName + " was a bit uncomfortable during the cleaning. But hey, at least " + pronoun + "'s clean!.");
					
					break;
				case 4:
					JOptionPane.showMessageDialog(null, petName + " had a big thorn stuck in " + p2 + " toe! Good thing you got that out. \n Happiness +5");
					happinessLevel +=5;
					break;
				}
				break;
			}
		if(happinessLevel < 1) {
			JOptionPane.showMessageDialog(null, petName + " couldn't take this kind of abuse, so " + pronoun + " died. \n Game Over.");
			System.exit(0);
		}
		if(happinessLevel > 20) {
			JOptionPane.showMessageDialog(null, petName + " was so happy living with you that " + pronoun + " decided to stay. \n You Win!");
			System.exit(0);
		}
		}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}