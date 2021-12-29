package qsp;

public class Box {
	double lenght;
	double breadth;
	double hight;

	Box(double lenght, double breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}

	Box(double lenght, double breadth, double hight) {
		this(lenght,breadth);
		this.hight = hight;

	}

	public void Display() {
		System.out.println("lenght: " + this.lenght);
		System.out.println("breadth: " + this.breadth);
		if (this.hight != 0.0) {
			System.out.println("hight: " + this.hight);
		}
	}

}
