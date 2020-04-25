package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class A_Java_Class_For_Coding_And_Algorithm_Things {
	public static void main(String[] args) {
		String User_Answer = JOptionPane.showInputDialog(null,
				"Put a number into the program, and the program " + "will tell you if it isn't prime");
		int answer_number = Integer.parseInt(User_Answer);

		for (int i = 2; i < answer_number; i++) {

			if (answer_number % i == 0) {
				JOptionPane.showMessageDialog(null, "This number is not prime");
				System.exit(0);

		}
		}
JOptionPane.showMessageDialog(null, "The number is prime.");
	}
}
