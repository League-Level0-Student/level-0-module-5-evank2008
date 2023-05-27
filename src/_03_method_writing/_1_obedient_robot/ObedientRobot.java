package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	drawSquare(200);
	drawTri(200);
	drawCircle(200);
	
}
static void drawSquare(int height) {
	Robot rob = new Robot();
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
	Robot rob = new Robot();
	rob.setSpeed(height/3);
	rob.setX(300);
	rob.setY(300);
	rob.turn(-90);
	rob.penDown();
	rob.setPenColor(255,255,0);
	
	for(int i =0;i<3;i++) {
		rob.turn(-240);
		rob.move((int) (height*1.2));
		
	}
	
}
static void drawCircle(int height) {
	Robot rob = new Robot();
	rob.setSpeed(height/3);
	rob.setX(300);
	rob.setY(300);
	rob.penDown();
	rob.setPenColor(0,0,255);
	
	for(int i =0;i<360;i++) {
		rob.turn(1);
		rob.move(1);
		
	}
	
}
}
