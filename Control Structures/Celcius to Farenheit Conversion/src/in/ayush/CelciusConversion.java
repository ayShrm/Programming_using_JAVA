package in.ayush;

import java.util.Scanner;

public class CelciusConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Float degree = sc.nextFloat();
		
		//Formula = 5 * (Farenheit -32) = 9 * Celcius
		Float farenheit = ((9 * degree) + (32 * 5))/5;
		
		System.out.println(farenheit);

	}

}
