package _02_nested_loops._3_for_loop_gauntlet;

public class DeathToTheForLoop {
	public static void main(String[] args) {
		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
		int number = 100;
		for (int b = 0; b < 101; b++) {
			System.out.println(number);
			number -= 1;
			int evenNumbers = 2;
			for (int i = 0; i < 50; i++) {
				System.out.println(evenNumbers);
				evenNumbers += 2;
			}
			int oddNumbers = 1;
			for (int i = 0; i < 50; i++) {
				System.out.println(oddNumbers);
				oddNumbers += 2;
			}
			int numberTo500 = 1;
			for (int i = 0; i < 500; i++) {
				if (numberTo500 % 2 == 1) {
					System.out.println(numberTo500 + " is odd");
					numberTo500 += 1;
				} else {
					System.out.println(numberTo500 + " is even");
					numberTo500 += 1;
				}

			}
			int numberTo777 = 7;
			for (int i = 0; i < 111; i++) {
				System.out.println(numberTo777);
				numberTo777 += 7;
			}
			int oldness = 0;
			int yearAlive = 2007;
			for (int i = 0; i < 13; i++) {
				System.out.println("In " + yearAlive + " I was " + oldness);
				yearAlive += 1;
				oldness += 1;
				for (int j = 0; j < 3; j++) {

					for (int z = 0; z < 3; z++) {
						System.out.println(j + " " + z);

					}

				}

				number = 1;
				for (int j = 0; j < 3; j++) {

					for (int j2 = 0; j2 < 3; j2++) {
						System.out.print(number + " ");
						number++;
					}
					System.out.println();
				}
				number = 1;
				for (int j = 0; j < 10; j++) {

					for (int j2 = 0; j2 < 10; j2++) {
						System.out.print(number + " ");
						number++;
					}
					System.out.println();
				}

				for (int j = 0; j < 6; j++) {
					for (int j2 = 0; j2 < j; j2++) {
						System.out.print("* ");

					}
					System.out.println();

				}

			}
		}
	}
}
