package qsp;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		for (i = 0; i < rows; i++) {
			for (j = i - rows; j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
