package qsp;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		int number, reminder;
		System.out.println("enter Any number ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		reminder = number % 2;
		if (reminder == 0) {
			System.out.println(number + " :is even number ");
		} else {
			System.out.println(number + " : is odd number ");
		}
	}

}
