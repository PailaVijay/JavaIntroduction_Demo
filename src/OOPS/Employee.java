package OOPS;

public class Employee {

	int empId;
	String Name;
	double salary;
	String Dept;
	
/*	Employee(int id,String nam,double sal,String dep)
	{
		empId=id;
		Name=nam;
		salary=sal;
		Dept=dep;
	} */
	
	void setValue(int id,String nam,double sal,String dep)
	{
		empId=id;
		Name=nam;
		salary=sal;
		Dept=dep;
		
	}
	
	void display()
	{
		System.out.println(empId);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(Dept);
		
	}
	public static void main(String[] args)
	{
		// Assigning the values to class using object
	/*	Employee emp1= new Employee();
		emp1.empId=101;
		emp1.Name="Vijay";
		emp1.salary=54213.00;
		emp1.Dept="QA";
		emp1.display();  */
		
		// Assign the value to class by using constructor
		
	/*	Employee emp1=new Employee(101, "Kumar", 56478, "Dev");
		emp1.display();   */
		
		// Assigning the values to class by using method
		
		Employee emp1=new Employee();
		emp1.setValue(102, "Reddy", 601148, "TL");
		emp1.display();
	}
}
