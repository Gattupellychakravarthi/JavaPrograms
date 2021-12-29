package qsp;

public class Program14 {
	String name;
	double Price;

	Program14() {
		this.name = "pamorian";
		this.Price = 7000.59;
	}

	Program14(String name, double Price) {
		this.name = name;
		this.Price = Price;

	}

	public void Showpiece() {
		System.out.println("Bread name of dog: " + this.name);
		System.out.println("Price of dog: " + this.Price);

	}
}
