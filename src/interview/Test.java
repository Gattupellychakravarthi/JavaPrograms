package interview;

public class Test {
	String name;
	int age;
	String Location;
	

	public Test(String name, int age, String location) {
		this.name = name;
		this.age = age;
		Location = location;
	}


	public static void main(String[] args) {
		Test obj = new Test("Chakravarthi",25,"Hyderabad");
		System.out.println("Name of the candidate: "+obj.name+ "candidate age: "+obj.age+ " Location: "+obj.Location);
	    
	}

}
