package qsp;

public class Bike {

	String BN;
	private double ST;
	double M;

	public double getST() {
		return this.ST;
	}

	public void setST(double ST) {

		if (ST >= 0 && ST <= 220.0) {
			this.ST = ST;

		} else {
			this.ST = 220.0;
		}

	}

	public Bike(String BN, double ST, double M) {
		this.BN = BN;
		this.M = M;
		if (ST >= 0 && ST <= 220.0) {
			this.ST = ST;
		} else {
			this.ST = ST;

		}

	}

	public void ride() {
		System.out.println(
				"Riding with rita to goa in  " + this.BN  + " having the top speed  " + this.ST + " having M " +  this.M);
	}

}
