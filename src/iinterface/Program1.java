package iinterface;

interface Program1 {
	public void window();

	public void window1();

}

interface Program0 extends Program1 {
	public void window2();

}

 abstract class P1 implements Program1  {
	public void window() {
		System.out.println("hellow ");
		int i = 10;
		System.out.println(i);
		int j = 20;
		System.out.println(j);
	}

	public void window2() {
		System.out.println("Hellow rjesh");
		int k = 10;
		int f = 20;
		System.out.println(k);
		System.out.println(f);

	}
	public static void main(String[] args) {
		
	}

}

