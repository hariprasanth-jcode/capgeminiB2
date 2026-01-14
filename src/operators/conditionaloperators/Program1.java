package operators.conditionaloperators;

public class Program1 {

	public static void main(String[] args) {
		// operand1?opreand2:operand3
		System.out.println(true ? 10 : 20);
		System.out.println(false ? "A" : 65);
		System.out.println(10 > 'A' ? true : false);
		System.out.println("Hello" != "hello" ? 'A' : true);
	    System.out.println(40>30?'A':'B');
	    String res=40>30?"A":"true"; 
	    System.out.println(res);
	}
}
