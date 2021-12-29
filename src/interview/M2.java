package interview;

public class M2 {
	private double hr;
	private double min;
	private double sec;

	public double gethr() {
		return this.hr;
	}

	public void sethr(double hr) {
		if (hr >= 1 && hr <= 12) {
			this.hr = hr;
		} else {
			System.out.println("Enter correct hour name: ");
		}
	}

	public double getmin() {
		return this.min;
	}

	public void setmin(double min) {
		if (min >= 1 && min <= 59) {
			this.min = min;
		} else {
			System.out.println("enter corret minute: ");
		}
	}

	public double getsec() {
		return this.sec;

	}

	public void setsec(double sec) {
		if (sec >= 1 && sec <= 59) {
			this.sec = sec;
		} else {
			System.out.println("enter correct time: ");
		}

	}

	public M2(double hr, double min, double sec) {
		if (hr >= 1 && hr <= 59) {

		}
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

}
