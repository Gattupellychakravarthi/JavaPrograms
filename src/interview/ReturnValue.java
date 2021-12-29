package interview;

public class ReturnValue {

	public static void main(String[] args) {
		main(10, 20);
		main(20.30, 30.20);
		main('b', 'a');

	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(double a, double b) {
		System.out.println(a + b);

	}

	public static void main(char a, char b) {
		System.out.println(a + b);
	}

}
