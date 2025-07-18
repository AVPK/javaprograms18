package practice;

public class NoParameterAndReturn {
	int d = 10;

	int method() {
		int a = 10, b = 20;
		int c = a + b + d;
		return c;

	}

	public static void main(String[] args) {
		NoParameterAndReturn obj = new NoParameterAndReturn();
		System.out.println(obj.method());
	}
}
