package oops.fundamental.non_static.methods;

public class Student {

	
	  int id;
	  String name;
	  double per;
	
	Student(){
		
	}
	
	Student(String name,double per){
		this.name=name;
		this.per=per;
	}
	
    Student(int id,String name,double per){
		this.id=id;
		this.name=name;
		this.per=per;
	}
    
    Student(String name,int id,double per){
		this.id=id;
		this.name=name;
		this.per=per;
	}
    
	public void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
	}
	
	
}
