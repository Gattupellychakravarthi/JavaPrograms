package qsp;

public class Clock {
	private int hr;
	private int min;
	private int sec;

	public int gethr() {
		return this.hr;
	}

	public void sethr(int hr) {
		if (hr >= 1 && hr <= 12) {
			this.hr = hr;
		} else {
			System.out.println("please enter valid hr");
		}
	}

	public int getmin() {
		return this.min;
	}

	public void setmin(int min) {
		if (min >= 0 && min <= 59) {
			this.min = min;
		} else {
			System.out.println("please enter valid min");
		}

	}

	public int getsec() {
		return this.sec;
	}

	public void setsec(int sec) {
		if (sec >= 0 && sec < 59) {
			this.sec = sec;
		} else {
			System.out.println("please enter valid sec ");
		}
	}

	Clock(int hr, int min, int sec) {
		if ((hr >= 1 && hr <= 12) && (min >= 0 && min <= 59) && (sec >= 0 && sec <= 59)) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		} else {
			System.out.println("Enter Proper time");
		}
	}

	public void showtime() {
		System.out.println("time in hr: " + this.hr);
		System.out.println("time in min: " + this.min);
		System.out.println("time in sec: " + this.sec);
	}
}
