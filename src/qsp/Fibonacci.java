package qsp;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci(0, 1);
	}

	public static void fibonacci(int a, int b) {
		int c = a + b;
		if (c < 200) {
			System.out.println(c);
		} else {
			return;
		}
		fibonacci(b, c);

	}

}
