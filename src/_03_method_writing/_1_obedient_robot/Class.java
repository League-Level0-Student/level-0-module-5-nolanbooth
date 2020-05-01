package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Class {
public static void main(String[]args) {
Robot bill = new Robot();
bill.penDown();	
for (int i = 0; i < 1; i++) {
		try {
			bill.microTurn(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	
	}
}
