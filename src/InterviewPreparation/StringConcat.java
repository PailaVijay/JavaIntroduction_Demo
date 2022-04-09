package InterviewPreparation;

public class StringConcat {

	public static void main(String[] args) {
		// concatnating
/*		String name="Vijay ";
		
		String newName=name.concat("Kumar");
		System.out.println(name);
		System.out.println(newName);
		
		//
		String s1= "vijay";
		String s2= "vijay";
		
		if(s1==s2)
			System.out.println("yes");
		else 
			System.out.println("no");  */
		
		//comparing two reference to object
		
		String s="vijay";
		String s1=new String("vijay");
		
		//if(s==s1)
		if(s.equals(s1))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
