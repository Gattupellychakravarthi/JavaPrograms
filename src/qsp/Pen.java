package qsp;

import java.util.Scanner;

public class Pen {
	String name;
	String price;
	String colour;

	
	  public Pen(String name, String price, String colour) { super(); this.name =
	  name; this.price = price; this.colour = colour;
	 
	}

	public void display() {
		System.out.println("Name of the Pen: " + this.name);
		System.out.println("Pen Original Price: " + this.price);
		System.out.println("Available in the market colours: " + this.colour);
	}

}
