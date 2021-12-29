package inbuiltclasses;

public class Program2 {
	String name;
	String empid;
	double  sal;
	public Program2(String name, String empid, double sal) {
		super();
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}
	
	public String toStringi() {
		return "Program2 [name=" + name + ", empid=" + empid + ", sal=" + sal + "]";
	}

}
