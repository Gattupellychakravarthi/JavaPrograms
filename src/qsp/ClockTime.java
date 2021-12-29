package qsp;

public class ClockTime {

	public static void main(String[] args) {
		Clock obj = new Clock(00, 00, 00);
		obj.sethr(12);
		System.out.println(obj.gethr());
		obj.setmin(55);
		System.out.println(obj.getmin());
		obj.setsec(55);
		System.out.println(obj.getsec());
		obj.showtime();

	}

}
