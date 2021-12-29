package qsp;

public class Clock1 {
	int hr;
	int min;
	int sec;
	public Clock1(int hr, int min, int sec) {
		super();
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public void Display() {
		System.out.println("Time "+this.hr +":"+this.min +":"+ this.sec);
		
	}
	

}
