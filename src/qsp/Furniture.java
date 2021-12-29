package qsp;

public class Furniture {

	public static void main(String[] args) {
		System.out.println("**************************************");
		Box obj = new Box(10.5, 5.5);
		obj.Display();
		System.out.println("**************************************");
		Box obj1 = new Box(10.5, 5.5);
		obj1.Display();
		System.out.println("**************************************");
		Box obj2 = new Box(10.5, 5.5, 3.3);
		obj2.Display();
		System.out.println("**************************************");

	}

}
