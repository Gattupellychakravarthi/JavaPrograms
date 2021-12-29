package inheritance;

public class ClassB extends ClassA {
	int e= 10;
	int f=20;
	public void window() {
		System.out.println("Hello pwolrld ");
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.toString());
		obj.main();
	
	}

}
