package in.ayush;

import java.util.Scanner;

public class CarDetails {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the car name:");
		String name = sc.nextLine();

		System.out.println("Enter the car no:");
		Integer no = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the price:");
		Double price = sc.nextDouble();

		System.out.println("Carname:" + name);
		System.out.println("Carno:" + no);
		System.out.println("Price:" + String.format("%.2f", price) + " rs only");

	}

}
