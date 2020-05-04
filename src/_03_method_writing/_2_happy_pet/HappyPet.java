package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happiness = 0;
	static String userPet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		userPet = JOptionPane.showInputDialog(null, "What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {
			
			
		int task = JOptionPane.showOptionDialog(null, "How do you want to take care of your "+userPet+"", 
					"A Question", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "FEED", "WATER", "CLEAN" }, null);
System.out.println(task);
if (task == 0) {
feed();
}else if (task == 1) {
	water();
}else if (task == 2) {
	clean();
}
System.out.println(happiness);	
JOptionPane.showMessageDialog(null, "your happiness level is "+happiness);
		}
		
// 5. Use user input to call the appropriate method created in step 4.
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}public static void feed() {
		happiness+=3;
		JOptionPane.showMessageDialog(null, "Your"  +userPet+ " gained 3 happiness points");
	}public static void water() {
		happiness+=5;
	JOptionPane.showMessageDialog(null, "Your"+userPet+" gained 5 happiness points");
	}public static void clean() {
		happiness+=2;
		JOptionPane.showMessageDialog(null, "Your "+userPet+" gained 2 happiness points");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}