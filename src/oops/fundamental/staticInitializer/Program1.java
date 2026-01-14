package oops.fundamental.staticInitializer;

public class Program1 {

	static int i=test();
	// Application ---> opening 
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(i);
		System.out.println("Main End");
	}
	
	public static int test() {
		System.out.println("Test");
		System.out.println(i);
		return 10;
	}
}
