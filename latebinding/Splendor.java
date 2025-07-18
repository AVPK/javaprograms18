package latebinding;

public class Splendor extends Bike {
	void run() {
		System.out.println("Running Safely with 60kms");
	}

	public static void main(String[] args) {
		Bike b = new Splendor();
		b.run();
	}
}
