package in.ayush;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of students placed in CSE:");
		Integer num = sc.nextInt();

		System.out.println("Enter the no of students placed in ECE:");
		Integer num2 = sc.nextInt();

		System.out.println("Enter the no of students places in MECH:");
		Integer num3 = sc.nextInt();

		if (num < 0 || num2 < 0 || num3 < 0) {
			System.out.println("Input is invalid");
		} else if (num == num2 && num2 == num3 && num3 == num) {
			System.out.println("None of the department has got the highest placement");
		} else if (num > num2 && num > num3) {
			System.out.println("Highest placement\nCSE");
		} else if (num2 > num && num2 < num3) {
			System.out.println("Highest placement\nECE");
		} else if (num3 > num && num3 > num2) {
			System.out.println("Highest placement\nMECH");
		} else if (num == num2) {
			System.out.println("Highest placement\nCSE\nECE");
		} else if (num == num3) {
			System.out.println("Highest placement\nCSE\nMECH");
		} else if (num2 == num3) {
			System.out.println("Highest placement\nECE\nMECH");
		}

	}

}
