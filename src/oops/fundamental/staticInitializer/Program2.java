package oops.fundamental.staticInitializer;

public class Program2 {

	static int i = 20;//single line initializer
	
	static { //Multiline initializer
	  i=30;
	  System.out.println(i);
	  System.out.println("Static Initilaizer block 1"); 
	  i=test1();
	}

	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println(i);
		System.out.println("Main End");
	}
	
	public static int test1() {
		System.out.println("Test1");
		System.out.println(i);
		return 10;
	}
	
	static {
		System.out.println("Static Initializer Block 2"); 
	}
}
