package _02_nested_loops._1_snowflake;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class Snowflake {

	public static void main(String[] args) {

		// #1. Make a new Robot

		Robot billy = new Robot();
// #2. Set your robot’s position to x=300 and y=300
		billy.miniaturize();
		billy.moveTo(300, 300);
		billy.penDown();
		// #3. Put the robot's pen down
		billy.setSpeed(5);

		// #4. Set the robot’s speed to 5

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6
		// times (use i as the counter)
		for (int i = 0; i < 6; i++) {
			billy.setPenColor(0, 0, 0);
			billy.move(50);
			billy.turn(60);
			// #6. Set the pen color to black

			// #7. move the robot by 50

			// #8. turn the robot to the right by 60

			// #12. set the pen color to blue for even numbers of i
			if (i % 2 == 0) {
				billy.setPenColor(42, 8, 166);
			} else {
				billy.setPenColor(191, 25, 25);
			}
		}
			// #13. set the pen color to red for all odd numbers of i

			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
		for (int i = 0; i < 6; i++) {
			
		
		for (int j = 0; j < 6; j++) {

			
			billy.turn(-60);
			// #10. turn the robot to the left by 60
			billy.move(50);
			}
		billy.move(50); 
	billy.turn(60);
		// #11. move the robot by 50 (play the start button)
		}
	billy.hide();
		// #14. set the pen color to black

	}

}
