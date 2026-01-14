package array;

public class Program4 {
	public static void main(String[] args) {

		
		int[] a= {1,4,6};
		
		System.out.println(a);
		//refvar[index]
		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		//System.out.println(a[-1]);
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		
		a[0]=10;
		a[1]=100;
		a[2]=200;
		//a[3]=500; AIOOBE
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			}
	}
}
