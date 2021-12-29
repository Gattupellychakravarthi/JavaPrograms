package qsp;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 365,rev = 0;
		while (n > 0) {
			
			rev = n % 10;
			rev = rev * 10 + n;
			n = n % 10;

		}
		System.out.println(rev);

	}

}
