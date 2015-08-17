import java.util.*;

public class Randomness_activity {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 100;
		Scanner in = new Scanner(System.in);
		System.out.println("## ## ##");
		System.out.println("1 2 3");

		il: while (true) {

			il1: for (;;) {
				System.out
						.println("Please enter the amount of bet you want to put in: ");
				a = in.nextInt();
				if (a > c) {
					System.out.println("You only have " + c
							+ " dollars. Please enter a smaller number: ");
					break il1;
				} else if (a < 5) {
					System.out.println("Please bet at least 5 dollars");
					break il1;
				}

				else {
					System.out.println("Please select the number: ");
					b = in.nextInt();

					Random r = new Random();
					int x = 1 + r.nextInt(3);

					Graph g = new Graph();
					g.output(x);
					if (x == b) {
						System.out.println("You win~");
						c = c + a;
						System.out.println("You have " + c + " dollars now!");
					} else {
						System.out.println("You lose!");
						c = c - a;
						System.out
								.println("You have " + c + " dollars left...");
					}
					if (c <= 0) {
						System.out.println("You don't have money, get out!");
						break il;
					} else if (c > 500) {
						System.out.println("Enjoy your night");
						break il;
					} else {
						System.out.println();
					}

				}

			}
		}
	}
}