package qsp;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int num, rem;
		System.out.println("Hello User Enter number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		rem = num % 2;
		if (rem == 0) {
			System.out.println("number is even ");

		} else {
			System.out.println("number is odd");
		}

	}

}
