package qsp;

public class TimeShows {
	
	public static void main(String[] args) {
		ClockTower obj = new ClockTower(new Clock1 (8,15,45),100,"gutta");
		obj.c.Display();
		obj.Display2();

	}

}
