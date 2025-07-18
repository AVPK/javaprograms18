package practice;

public class NoParameterNoReturn {
	String name = "Swathi";
	String color = "Black";
	int price = 40;

	void write() {
		System.out.println("Pen Writes");
	}

	void study() {
		System.out.println(name + " reads Everyday");
	}

	public static void main(String[] args) {
		NoParameterNoReturn obj = new NoParameterNoReturn();
		System.out.println("Main Starts");
		obj.write();
		obj.study();
		System.out.println("Main Ends");
	}
}