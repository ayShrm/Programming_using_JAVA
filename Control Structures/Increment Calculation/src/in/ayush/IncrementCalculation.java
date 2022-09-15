package in.ayush;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the salary");
		int salary = sc.nextInt();

		System.out.println("Enter the Performance appraisal rating");
		Float appraisal = sc.nextFloat();

		if (salary <= 0 || (appraisal < 1 && appraisal > 5)) {
			System.out.println("Invalid Input");
		}

		if (appraisal >= 1 && appraisal <= 3) {
			int sal = (int) (salary + salary * 0.1);
			System.out.println(sal);
		}

		if (appraisal >= 3.1 && appraisal <= 4) {
			int sal = (int) (salary + salary * 0.25);
			System.out.println(sal);
		}

		if (appraisal >= 4.1 && appraisal <= 5) {
			int sal = (int) (salary + salary * 0.30);
			System.out.println(sal);
		}

	}

}
