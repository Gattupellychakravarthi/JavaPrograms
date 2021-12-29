package qsp;

public class Program2 {

	int i = 10;
	static int j = 20;
	static Program2 obj = new Program2();

	public static void main(String[] args) {
		System.out.println(Program2.obj.i);
		Program2 obj = new Program2();
		System.out.println(obj.j);
	}

}
