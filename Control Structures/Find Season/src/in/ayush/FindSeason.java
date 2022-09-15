package in.ayush;

import java.util.Scanner;

public class FindSeason {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month:");
		int month = sc.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("Invalid month");
		}

		if (month >= 3 && month <= 5) {
			System.out.println("Season:Spring");

		}
		if (month >= 6 && month <= 8) {
			System.out.println("Season:Summer");

		}
		if (month >= 9 && month <= 11) {
			System.out.println("Season:Autumn");

		}
		if (month == 12 || month <= 2) {
			System.out.println("Season:Winter");

		}

	}

}
