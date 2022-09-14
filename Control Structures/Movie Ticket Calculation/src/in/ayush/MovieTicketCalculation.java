package in.ayush;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of ticket:");
		Integer ticket = sc.nextInt();

		if (ticket < 5 || ticket > 40) {
			System.out.println("Minimum of 5 and maximum of 40 tickets");
		} else {

			System.out.println("Do you want refreshment:");
			Character ref = sc.next().charAt(0);

			System.out.println("Do you have coupon code:");
			Character coupon = sc.next().charAt(0);

			System.out.println("Enter the circle:");
			Character circle = sc.next().charAt(0);

			Double cost = 0.0;

			if (!circle.equals('k') && !circle.equals('q')) {
				System.out.println("Invalid Input");
			}

			if (circle.equals('k')) {
				cost = (double) (ticket * 75);
			}

			if (circle.equals('q')) {
				cost = (double) (ticket * 150);
			}

			if (ticket > 20) {
				cost = cost - cost * 0.1;
			}

			if (coupon.equals('y') || coupon.equals('Y')) {
				cost = cost - cost * 0.02;
			}

			if (ref.equals('y') || ref.equals('Y')) {
				cost = (double) (cost + (ticket * 50));
			}

			System.out.println("Ticket cost:" + String.format("%.2f", cost));
		}
	}
}
