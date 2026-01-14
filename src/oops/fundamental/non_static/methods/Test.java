package oops.fundamental.non_static.methods;

public class Test {
	
	//Constructor
	// NSM --> return type
	// Student , id , name ,per  constructor and display()
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1;
		s1.name="Allen";
		s1.per=90.3;
		
		Student s2=new Student(2,"Miller",80.5);
		s2.display();
		
			
	}
}
