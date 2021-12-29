package qsp;

import java.util.Scanner;

public class Newproject2 {
	String name;
	int age;
	String Office;
	String Adress;
	public Newproject2(String name, int age, String office, String adress) {
		Scanner scan = new Scanner(System.in);
		name=scan.next();
		age=scan.nextInt();
		Office= scan.next();
		Adress=scan.next();
		this.name = name;
		this.age = age;
		Office = office;
		Adress = adress;
	}
	public void main(){
		System.out.println("name of candidate: "+ name);
		System.out.println("age of ocandidate: "+ age);
		System.out.println("candidate office adress: "+ Office);
		System.out.println("candidate Adress: "+ Adress);
	}

}
