package oops.fundamental.non_static.methods;

public class Person {

	String name;
	int age;
	String gender;
	Person(){
		
	}
	
	
	Person(int a){
		System.out.println("Person int a");
	}
	public void display() {
		System.out.println("this : "+this);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
	
	Person(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	
}
