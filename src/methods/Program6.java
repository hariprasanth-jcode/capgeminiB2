package methods;

public class Program6 {
	public static void main(String[] args) {

		   String res=perfectSquare(8);
		   System.out.println(res);
	}
	
	public static String perfectSquare(int num) {
		int count=0;//1
		for(int i=1;i<=num+1;i++) {
			if(i*i==num+1) {
				count++;
				break;	
			}	
		}	
	return count==1?"sunny number":"not sunny number";
	}
}
