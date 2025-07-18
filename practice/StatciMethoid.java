package practice;

public class StatciMethoid {
	static int d = 20;

	static void method(int a, int b) {
		int c = a + b + d;
		System.out.println(c);
	}

	public static void main(String[] args) {
		method(10, 20);
	}
}
