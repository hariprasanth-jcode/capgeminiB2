package looping_tmt.whileloop;

public class Program2 {
	
	// Assingment
	// 10->1010
	// 10%2-->0
	// 5%2-->1
	public static void main(String[] args) {

		int num=1863;
		int rev=0;//3681
		 
		while(num!=0) {
		rev=num%10+rev*10;
		num=num/10;
		}
		
		System.out.println(rev);
		
		
	}
}
