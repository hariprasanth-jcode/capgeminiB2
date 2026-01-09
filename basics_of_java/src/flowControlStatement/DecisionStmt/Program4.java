package flowControlStatement.DecisionStmt;

public class Program4 {
	
  public static void main(String[] args) {
	//special 2 digit number
	  // 29---> 2 + 9  2*9---> 11 +  18=29
	  int num=39;
	  int temp=num;
	  int last=num%10;
	  int first=num/10;
	  int sum=last+first;
	  int product=last*first;
	  if(temp==(sum+product)) {
		  System.out.println("Special 2 digit Number");
		  
	  }else {
		  System.out.println("Not a special 2 digit number");
	  }
  }
}
