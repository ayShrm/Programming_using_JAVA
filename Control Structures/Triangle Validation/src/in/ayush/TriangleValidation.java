package in.ayush;

import java.util.Scanner;

public class TriangleValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for side1");
		Integer side1 = sc.nextInt();

		System.out.println("Enter the value for side2");
		Integer side2 = sc.nextInt();

		System.out.println("Enter the value for side3");
		Integer side3 = sc.nextInt();

		if (side1 <= 0 || side2 <= 0 || side2 <= 0) {
			System.out.println("Invalid Input");
		} else if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			System.out.println("Sides form a Triangle");
		} else {
			System.out.println("Sides does not form a Triangle");
		}

	}

}
