package twodArray;

public class Program1 {
	
	public static void main(String[] args) {
    
		int[][] a= {{100,4},{200,3}};
		for(int i=0;i<a.length;i++) {
			//outer loop is to iterate array
			for(int j=0;j<a[i].length;j++) {
			// inner loop is to iterate the element
		    System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
