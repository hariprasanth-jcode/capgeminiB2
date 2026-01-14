package array;

public class Program7 {
	public static void main(String[] args) {


		
		Employee[] employee=new Employee[5];
		employee[0]=new Employee(1,"Adam",200000);
		employee[1]=new Employee(2,"Miller",3000000);
		employee[2]=new Employee(3,"King",400000);
		
		for(int i=0;i<employee.length;i++) {
			employee[i].display();
			//null.display();
		}
		
		
	}
}
