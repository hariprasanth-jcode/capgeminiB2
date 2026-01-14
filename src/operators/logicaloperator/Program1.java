package operators.logicaloperator;

public class Program1 {
	public static void main(String[] args) {

		
		System.out.println(true && false && true);
		
		int a=5;
		System.out.println(a<10 && ++a<a);
		System.out.println(a);
		/*
		 Logical And operator checks for false value
		 and will get terminate for single false value
		 * */
	}
}
