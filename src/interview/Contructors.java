package interview;

public class Contructors {
	String name;
	double price;
	String location;

	Contructors() {

		name = "Hp";
		price =20.30;
		location="Hyderabad";

	}


	

	public void display() {
		System.out.println("Laptop Name: " + this.name);
		System.out.println("Laptop Price: " + this.price);
		if (this.location != null) {
			System.out.println("laptop Location: " + this.location);
		}

	}
	

}
