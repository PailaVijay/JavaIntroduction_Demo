package ArraysDemo;

public class StringMethods {

	public static void main(String[] args) {
		
		// length of the string value
		String name="PailaBijayaKumarReddy";
		System.out.println(name.length());
		
		// use of Concatenating
		String s="Welcome to ";
		String s1="Training";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		
		// use of Equals method 
		
		String m1= "VIJAY";
		String m2="vijay";
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equalsIgnoreCase(m2));
		
		//use of contains method
		String v= "Welcome to my World where there is no caste system";
		
	    System.out.println(v.contains("ld"));
	    
	    // use of subString method
		String b= "WELCOME";
		System.out.println(b.substring(0, 3));
		
		// use of replace method
		String u= "WORKHARD";
	    System.out.println(	u.replace("R", "O"));
	    System.out.println(u.replace("WORK", "DO"));  
		
		

	}

}
