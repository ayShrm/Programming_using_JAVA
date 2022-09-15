package in.ayush;

import java.util.Scanner;

public class IncomeCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of hours worked in a day:");
		int hours = sc.nextInt();
		
		if(hours<0 || hours>24) {
			System.out.println("Unable to calculate the earnings");
		}else {
			System.out.println("Total income in a year:"+hours*100*365);
		}

	}

}
