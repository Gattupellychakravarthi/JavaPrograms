package qsp;

public class ClockTower {
	int hight;
	String loc;
	Clock1 c;

	public ClockTower(Clock1 c,int hight, String loc) {

		this.hight = hight;
		this.loc = loc;
		this.c=c;
	}
	public void Display2() {
		System.out.println("Clock hight: "+this.hight);
		System.out.println("ClockTower Location: "+this.loc);
	}

}
