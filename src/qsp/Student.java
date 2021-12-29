package qsp;

public class Student {
	String sN;
	double tP;
	double twP;
	double dP;

	Student (String sN,double tP, double twP) {
		this.sN = sN;
		this.tP = tP;
		this.twP=twP;
	}

	Student(String sN ,double tP, double twP, double dP) {
		this(sN,tP,twP);
		this.dP = dP;

	}

	public void Display() {
		System.out.println("Name : " + this.sN);
		System.out.println("tenth: " + this.tP);
		System.out.println("secondary: " + this.twP);
		if (this.dP != 0.0) {
			System.out.println("degreeqs: " + this.dP);
		}
	}


}
