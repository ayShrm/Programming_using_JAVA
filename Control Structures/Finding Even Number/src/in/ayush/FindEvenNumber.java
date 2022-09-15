package in.ayush;

import java.util.Scanner;

public class FindEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		Integer num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is not an even number");
		}

	}

}
