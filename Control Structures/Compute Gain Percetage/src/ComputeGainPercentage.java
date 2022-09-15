import java.util.Scanner;

public class ComputeGainPercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Price of old scooter:");
		Float oldPrice = sc.nextFloat();

		System.out.println("The amount spent for repair:");
		Float repair = sc.nextFloat();

		System.out.println("Sold Price:");
		Float soldPrice = sc.nextFloat();

		Float price = oldPrice + repair;

		if (oldPrice <= 0 || soldPrice <= 0 || repair < 0) {
			System.out.println("Incorrect Inputs");
		} else {
			if (soldPrice < (price)) {
				System.out.println("Unable to calculate Gain Percentage");
			} else {
				Float gain = (((soldPrice - price) / price) * 100);
				System.out.println("Gain percentage is " + String.format("%.2f", gain));
			}
		}
	}
}
