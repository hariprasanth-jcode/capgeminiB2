package array;

public class Program2 {
	public static void main(String[] args) {

		int[] a= {3,4,8};
       System.out.println(a);		
       
       double[] d= {4.5,2.7,1,0.0};
       System.out.println(d);
       
       String[] s= {"A","B",null};
       System.out.println(s);
       
       Student[] student= {new Student(),new Student(),null};
       
       System.out.println(student);
       
       Employee[] emp= {new Employee(),new Employee()};
       System.out.println(emp);
	}
}
