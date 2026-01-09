package operators.logicaloperator;

public class Program2 {
	public static void main(String[] args) {

		
		System.out.println(false ||  true || false);
		
		int a=6;
		System.out.println(!(a<10) || ++a>10);
		System.out.println(a);
		/*
		  Logical Or operator will check only for true
		  condition and terminates the program for single
		  true value
		 */
	}
}
