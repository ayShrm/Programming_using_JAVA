package in.ayush;

import java.util.Scanner;

public class RoadSignaling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color");
		String color = sc.nextLine();
		switch (color) {
		case "green":
			System.out.println("go");
			break;
		case "yellow":
			System.out.println("proceed with caution");
			break;
		case "red":
			System.out.println("stop");
			break;
		default:
			System.out.println("prepare to go");
			break;
		}

	}

}
