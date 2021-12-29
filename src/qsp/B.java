package qsp;

public class B extends A{
	B(){
		super();
	}
	public static void main(String[] args) {
		A obj = new A();
		A obj1= new A();
		B obj2= new B();
		B obj3= new B();
		System.out.println("Count of objcts:"+A.count);
	}

}
