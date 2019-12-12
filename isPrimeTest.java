package practice;

import java.util.Scanner;

public class PrimeClass3 {

	boolean prime22233(int value) {
		int count = 0;
		int root = (int) Math.sqrt(value);
		boolean fact = true;

		if (value < 2) {
			System.out.println("Try another Number greater or equal to Three");
			return !fact;
		}

		for (int i = 2; i <= root; i++) {
			count++;
			if (value % i == 0) {
				System.out.println(value + " is not a prime number.");
				System.out.println("count:" + count);
				fact = false;
				return fact;
			}
		}

		System.out.println(value + " is a prime number.");
		System.out.println("count:" + count);
		return fact;
	}

	//test it here;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first by creating new object and instance method;
		PrimeClass3 pc = new PrimeClass3();
		pc.prime22233(1103);

		//Second, using a user input;
		System.out.println("please enter your Integer here: ");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();

		PrimeClass3 pc1 = new PrimeClass3();

		pc1.prime22233(input);

	}
}
