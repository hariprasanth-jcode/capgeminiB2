package looping_tmt.forloop;

public class Program3 {
public static void main(String[] args) {
	//prime
	
	int i=16;
	int count=0;
	
   for( int j=1;j<=i;j++) {
   if(i%j==0){
    	count++;
   }
  }
   if(count==2) {
	   System.out.println("Prime");
   }else {
	   System.out.println("Not a Prime");
   }
	// 3 set of question paper--> 20 questions
   
}
}
