package ConditionalStatements;

public class tables {

	public static void main(String[] args) {
		
		int t=5;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+t*i);
			
		}
		// finding factorial
		int number=5,fact=1;
		
	//	for(int i=1;i<=number;i++)
		for(int i=number;i>=1;i--)
		{
			
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
			
		
	}

}
