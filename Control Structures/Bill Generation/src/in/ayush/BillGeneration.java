package in.ayush;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of pizzas brought:");
		Integer pizzas = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the no of puffs bought:");
		Integer puffs = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the no of cool drinks bought:");
		Integer coolDrinks = sc.nextInt();
		sc.nextLine();

		Integer totalPrice = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+coolDrinks);
		System.out.println("Total price="+totalPrice);
		System.out.println("ENJOY THE SHOW!!!");

	}

}
