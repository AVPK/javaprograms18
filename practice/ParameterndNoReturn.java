package practice;

public class ParameterndNoReturn {
	int d = 10;

	void Method(String Name) {
		System.out.println("Hi " + Name + "= total is " + d);

	}

	public static void main(String[] args) {
		ParameterndNoReturn obj = new ParameterndNoReturn();
		obj.Method("Swathi");
	}
}
