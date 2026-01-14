package oops.fundamental.non_static;

public class Program4 {

	int i=3;
	static String s="Hello";
	public static void main(String[] args) {

		Program4 obj1=new Program4();
	
		
		Program4 obj2=new Program4();
		
		System.out.println(obj1==obj2);
		
		System.out.println(obj1.i);
		System.out.println(Program4.s);
		System.out.println(obj1.s);
		
	}
}
