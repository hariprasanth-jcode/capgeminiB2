package methods;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		test();
		System.out.println("Main End");
	}
	
	public static void test() {
		System.out.println("Test Start");
		test();
		System.out.println("Test End");
	}
}
