package looping_tmt.forloop;

public class Program4 {
	public static void main(String[] args) {

		int n=3;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row+col<=n+1) {
					System.out.print("*");
				}else {
					System.out.print(" "); 
				}
			}
			System.out.println();
			
		}
	}
}
