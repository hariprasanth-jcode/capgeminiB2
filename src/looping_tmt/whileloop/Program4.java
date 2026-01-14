package looping_tmt.whileloop;

public class Program4 {
	public static void main(String[] args) {

		int num=123;
		int sum=0;// 3
		int product=1;
		while(num!=0) {// 123!=0,12!=0
		sum=sum+num%10;//0 + 3-->3
		product=product*num%10;
		num=num/10;//123/10-->12
		}
		System.out.println(sum);
		System.out.println(product);
	}
}
