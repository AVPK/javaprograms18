package practice;

public class NoParameterNoReturn3 {
	int g = 10;

	void Method() {
		int b = 40;
		System.out.println(b);
		System.out.println(g);
	}

	public static void main(String[] args) {
		NoParameterNoReturn3 obj = new NoParameterNoReturn3();
		obj.Method();
		System.out.println(obj.g);
	}
}
