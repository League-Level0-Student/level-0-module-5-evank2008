package _02_nested_loops._2_amazing_rings;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Create a pair of Amazing Rings!
 * 
 * 1. Open the demonstration for this recipe by opening the Recipe.html
 *    file in this folder.
 * 
 * In the setup() method:
 * 2. Set the size of your window to be a rectangle like in the recipe
 *    demonstration
 * 3. Call the noFill() command so all the ellipses will be transparent
 *
 * In the draw() method:
 * 4. Use a for loop to make the first set of rings that will start in the
 *    left half of the window (you can use your code from Bullseye).
 * 
 * 5. Make this set of rings move across the sketch to the right
 *    Hint: make two variables, one for x and another for the speed.
 *    Then increase x by the amount in speed.
 *
 * 6. When the rings reach the right side of the sketch, reverse the direction
 *    so they move
 *    Hint: speed = -speed
      
 * 7. When the rings reach the left side of the sketch, reverse the direction
 *    again.
 * 
 * CHALLENGE - to finish the Amazing Rings
 * 8. Add another for loop to draw the second set of rings that will start in
 *    the right half of the window
 *
 * 9. Make this set of rings move in the opposite direction to the other rings
 *    These rings must also "bounce" off the sides of the window.
 */
public class AmazingRings extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int xPos = 400;
int xPos2 = 1200;
int xSpeed = 30;
int xSpeed2 = -30;
    PImage waldo;

    @Override
    public void settings() {
size(1600,800);
    }

    @Override
    public void setup() {

noFill();
    }

    @Override
    public void draw() {
    	background(100,100,100);
    	for(int i = 30;i>0;i--) {
    		  if(i%2 == 0) {
    		//fill(0,0,0);
    		  }
    		  else {
    		//fill(100,0,0);
    		  }
    		  ellipse(xPos,400,i*20,i*20);
    		  }
      	xPos+=xSpeed;
      	for(int i = 30;i>0;i--) {
    		  if(i%2 == 0) {
    		//fill(0,0,0);
    		  }
    		  else {
    		//fill(0,0,100);
    		  }
    		  ellipse(xPos2,400,i*20,i*20);
    		  }
      	xPos2+=xSpeed2;
      	if(xPos >= 1200) {
    		xSpeed = -xSpeed;
    	}
    	if(xPos <= 400) {
    		xSpeed = -xSpeed;
    	}
    	if(xPos2 >= 1200) {
    		xSpeed2 = -xSpeed2;
    	}
    	if(xPos2 <= 400) {
    		xSpeed2 = -xSpeed2;
    	}
  }
    

    static public void main(String[] args) {
        PApplet.main(AmazingRings.class.getName());
    }
}