package practice;

public class ParameterndNoReturn2 {
	void method(int a, int b, int c) {
		c = a + b;
		System.out.println("sum=" + c);
	}

	public static void main(String[] args) {
		ParameterndNoReturn2 obj = new ParameterndNoReturn2();
		obj.method(10, 20, 30);
	}
}
