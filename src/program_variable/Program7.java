package program_variable;

public class Program7 {
	public static void main(String[] args) {

		char c='A';// 2 byte
		// Widening 2 byte ---> 4 byte-->
		//(implicit typecasting) Typecasting
	// Implicit typecasting (widening)
	//Explicit typecasting (narrowing)
		int i=c;//4 byte
		
		System.out.println(i);
		
		int j=65;//4 byte
		
		char ch=j;//2 byte
		
		System.out.println(ch);
		
		
	}
}
