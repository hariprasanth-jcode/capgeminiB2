package oops.fundamental.non_static_initializer;

public class Program1 {

	//SB,Main,NSB-3,TEST,NSB-3,Test

	
	static{
		System.out.println("Static Block 1");
	}
	{
		System.out.println("Non-Static Block 3");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new Program1();
		new Program1();
		
	}
	public int test() {
		System.out.println("Test");
		return 10;
	}
	int a=test();
}
