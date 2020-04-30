package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ROBOTPET {
	Robot bill = new Robot();

	public static void main(String[] args) {
		ROBOTPET pet = new ROBOTPET();
		pet.drawSquare();
	}

	public void drawSquare() {
		for (int i = 0; i < 4; i++) {
			bill.move(100);
			bill.turn(90);
		}
	}

}