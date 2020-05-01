package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ROBOTPET {
	Robot bill = new Robot();
	
	public static void main(String[] args) {
		ROBOTPET pet = new ROBOTPET();
String answer =	JOptionPane.showInputDialog("What shape do you want to draw");	
		
if(answer.equalsIgnoreCase("Square")) {
	pet.drawSquare();
}
else if (answer.equalsIgnoreCase("triangle")) {
	pet.drawTriangle();
}
	else if (answer.equalsIgnoreCase("pentagon")) {
	pet.drawPentagon();	
	}
	else if (answer.equalsIgnoreCase("hexagon")) {
		pet.drawHexagon();
	}
	else if (answer.equalsIgnoreCase("circle")) {
	pet.drawCircle();
		}
	}
	public void drawCircle() {
		bill.penDown();
		bill.miniaturize();
	for (int i = 0; i < 18; i++) {
	 bill.move(2);
	bill.turn(2);
	}
	
	
	}
	
	
public void drawHexagon() {
	bill.miniaturize();
bill.penDown();
	for (int i = 0; i < 6; i++) {
bill.move(100);	
bill.turn(360/6);
	}	
}	
	
	public void drawPentagon() {
		bill.miniaturize();
	bill.penDown();
		for (int i = 0; i < 5; i++) {
		bill.move(100);
	bill.turn(360/5);
	}
	
	}
	
	public void drawSquare() {
		bill.miniaturize();
		bill.penDown();
		for (int i = 0; i < 4; i++) {
			bill.move(100);
			bill.turn(360/4);
		}
	}
public void drawTriangle() {
bill.miniaturize();
	bill.penDown();
	for (int i = 0; i < 3; i++) {
	bill.move(100);
	bill.turn(360/3);
		}	
	}
}