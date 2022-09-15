package in.ayush;

import java.util.Scanner;

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the units consumed");
		Integer units = sc.nextInt();
		
		if(units <= 20) {
			System.out.println("No Charge");
		}
		if(units >20 && units<100) {
			System.out.println("You have to pay Rs."+units*3.50);
		}
		if(units>=100) {
			System.out.println("You have to pay Rs."+units*5.00);
		}

	}

}
