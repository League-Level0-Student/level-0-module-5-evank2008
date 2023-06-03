package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	
public static void main(String[] args) {
	rob.hide();
	int heightInput = Integer.parseInt(JOptionPane.showInputDialog("Let's draw a shape. How big should the shape be?"));
	String shape = JOptionPane.showInputDialog("Pick a shape - square, circle, or triangle.");
	switch(shape) {
	case "square":
		drawSquare(heightInput);
		break;
	case "triangle":
		drawTri(heightInput);
		break;
	case "circle":
		drawCircle(heightInput);
		break;
		default:
			JOptionPane.showMessageDialog(null, "I don't know that shape!");
	}
	

		
}
static void drawSquare(int height) {

	rob.setX(300);
	rob.setY(300);
	rob.penDown();
	rob.setPenColor(255,0,0);
	rob.setSpeed(height/4);
	for(int i =0;i<4;i++) {
		rob.move(height);
		rob.turn(90);
	}
	
}
static void drawTri(int height) {

	rob.setSpeed(height/3);
	rob.setX(300);
	rob.setY(300);
	rob.turn(-90);
	rob.penDown();
	rob.setPenColor(255,255,0);
	
	for(int i =0;i<3;i++) {
		rob.turn(-240);
		rob.move((int) (height*1.14));
		
	}
	
}
static void drawCircle(int height) {

	rob.setSpeed(height);
	rob.setX(392);
	rob.setY(300);
	rob.penDown();
	rob.setPenColor(0,0,255);
	
	for(int i =0;i<36;i++) {
		rob.turn(10);
		rob.move(height/11);
		
	}
	
}
}
