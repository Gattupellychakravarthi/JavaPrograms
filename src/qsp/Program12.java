package qsp;

public class Program12 {
	String gun;
	int bullet;

	public Program12(String gun, int bullet) {
		this.gun = gun;
		this.bullet = bullet;
	}

	public void firing() {
		for (int i = 1; i <= this.bullet; i++) {
			System.out.println("fires.......");

		}
		System.out.println("fire two times");
	}
}
