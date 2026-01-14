package operators.logicaloperator;

public class Program3 {
	public static void main(String[] args) {
     //Logical Not !--> Unary 
	// Negate the value
		
		System.out.println(!true);
		System.out.println(!false);
		
		int a=6;
		System.out.println(!(a<10) || ++a>10);
		System.out.println(a);
		
		int b=6;
		System.out.println(!(b<10) && ++b>10);
		System.out.println(b);
		
	}
}
