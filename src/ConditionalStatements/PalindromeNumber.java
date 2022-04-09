package ConditionalStatements;

public class PalindromeNumber {

	public static void main(String[] args) {
		int no= 1221;
		int temp=no;
	    int reverse=0;
	    int rem;
	    
	    while(temp!=0)
	    {
	    	rem=temp%+10;
	    	reverse=reverse*10+rem;
	    	temp=temp/10;
	    }
	     if(no==reverse)
	     {
	    	 System.out.println(no+": palindrome number");
	     }
	     else
	     {
	    	 System.out.println(no+": not palindrome number");
	     }
	    
	  
		
		

	}

}
