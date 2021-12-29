package qsp;

public class NewProject {
	public static void main(String[] args) throws InterruptedException {
		NewProject1 obj = new NewProject1();
		Thread ts = new Thread(obj);
		NewProject3 obj1 = new NewProject3();
		Thread ts1 = new Thread(obj1);
		ts.start();
		ts.setName("chakri");
		ts1.setName("chaithu");
		System.out.println(ts.getName());
		System.out.println(ts1.getName());

		ts1.start();
	}
}

class NewProject1 extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}
}

class NewProject3 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}

	}
}
