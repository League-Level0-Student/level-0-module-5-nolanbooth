package _01_algorithms._2_fibonacci;


public class The_Special_Spiral {
public static void main(String[] args) {
	int first_Number = 0;
	int second_Number = 1;

	System.out.println(first_Number);
	System.out.println(second_Number);
	
	for (int i = 0; i < 100; i++) {
		int third_Number = first_Number + second_Number;
		System.out.println(third_Number);	
	first_Number = second_Number;
	second_Number = third_Number;
	}
	}
}