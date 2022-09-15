package in.ayush;

import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int digits[] = new int[4];
		System.out.println("Enter the digits:");
		for (int i = 0; i < 4; i++) {
			digits[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(digits[i] + "-" + (char) digits[i]);
		}
	}
}
