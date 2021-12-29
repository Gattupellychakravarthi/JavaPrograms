package qsp;

public class Program1 {
	static int i = 10;
	int j = 20;

	static {
		System.out.println(i);
		System.out.println(Program1.i);
		Program1 obj = new Program1();
		System.out.println(obj.j);
	}
	{
		System.out.println(j);
		System.out.println(this.j);

	}

	public static void main(String[] args) {
		System.out.println(i);
		Program1 obj = new Program1();
		System.out.println(obj.j);
		obj.run();
	}

	public void run() {
		System.out.println(j);
		System.out.println(Program2.j);
		Program2 obj = new Program2();
		System.out.println(obj.j);
	}

}
