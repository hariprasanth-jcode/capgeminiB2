package array;

public class Employee {

	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}
