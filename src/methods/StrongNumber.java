package methods;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145;//0
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
	System.out.println(sum==temp?"Strong Number":"Not a Strong number");
	}
	
	public static int factorial(int rem) {
		int product=1;
		while(rem!=0) {
			product=product*rem;
			rem--;
		}
		return product;
	}
	
	
}
