package in.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {

	public static void main(String args[]) {

		int flag = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first letter:");
		if (sc.next().charAt(0) != 'R') {
			flag++;
		}

		System.out.print("Enter the second letter:");
		if (sc.next().charAt(0) != 'A') {
			flag++;
		}

		System.out.print("Enter the third letter:");
		if (sc.next().charAt(0) != 'I') {
			flag++;
		}

		System.out.print("Enter the fourth letter:");
		if (sc.next().charAt(0) != 'N') {
			flag++;
		}

		System.out.print("Enter the fifth letter:");
		if (sc.next().charAt(0) != 'B') {
			flag++;
		}

		System.out.print("Enter the sixth letter:");
		if (sc.next().charAt(0) != 'O') {
			flag++;
		}

		System.out.print("Enter the seventh letter:");
		if (sc.next().charAt(0) != 'W') {
			flag++;
		}

		if (flag == 0) {
			System.out.print("RAINBOW");
		} else {
			System.out.println("The spelling is wrong");
		}

	}
}
