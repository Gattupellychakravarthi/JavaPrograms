package mock_test;

import java.util.Scanner;

public class User_logic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		String_Method[] b = new String_Method[size];
		for(int i=0;i<size;i++) {
		  System.out.println("Enter the book name");
		  String BN = scan.next();
		  System.out.println("Enter no of pages");
		  int pages =scan.nextInt();
		  System.out.println("Enter cost");
		  double cost = scan.nextDouble();
		  b[i]= new String_Method(BN, pages, cost);
		}
		

	}

}
