package operators.relationaloperators;

public class Program1 {
	// 'A'--> ASCII
	// "A"---> hashCode --> hashFunction
	public static void main(String[] args) {
		
	  boolean res=10>20;
		System.out.println(res);
	  res='A'<'B';
	  System.out.println(res);
	  res= "A"=="B";
	  System.out.println(res);
	  res= "A"!="B";
	  System.out.println(res);
	  res= true==false;
	  System.out.println(res);
	  
	  // >,<,>=,<=,==,!=
	  //byte,short,int , long
	  // String , boolean -->  ==,!=
		
	}
}
