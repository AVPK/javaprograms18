package practice;

public class ParameterAndReturn {
	int d = 20;

	int method(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		ParameterAndReturn obj = new ParameterAndReturn();
		System.out.println(obj.method(10, 20));
	}
}
