package in.ayush;

import java.util.Scanner;

public class CheckingTheBudgetOfMobile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the mobile");
		Long cost = sc.nextLong();
		
		if(cost<=13000) {
			System.out.println("Mobile chosen is within the budget");
		}
		else {
			System.out.println("Mobile chosen is beyond the budget");
		}

	}

}
