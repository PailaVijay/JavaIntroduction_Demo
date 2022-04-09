package ConditionalStatements;




public class Reverse_Action {

	public static void main(String[] args) {
		
		// printing reverse number
		int number=123456789;
		int rem;
		int reversValue=0;
		
		while(number!=0)
		{
			rem=number%10;
			reversValue= reversValue*10+rem;
			number=number/10;
		}
		System.out.println(reversValue);

		
		// printing reverse character
		
	/*	String name= "Bijaya Kumar Reddy";
		int l=name.length();
		System.out.println(l);
	
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		} */
		// find upper case and lower case letter
		
		String Q= "GjUkuMhb ^%$jFh453 ";
		
		int uppercase=0,lowercase=0,num=0,special=0;

		for(int i=0;i<Q.length();i++)
		{
			char ch= Q.charAt(i);
			if(ch>='A' && ch<'Z')
			{
				//System.out.print(ch);
				uppercase++;
			}
			else if(ch>='a' && ch<='z')
			{
				//System.out.println(ch);
				lowercase++;
			}
			else if(ch>='0' && ch<='9')
			{
				//System.out.println(ch);
				num++;
			}
			else
			{
				special++;
			}
			
			
			
		}
		System.out.println("Uppercase letter : "+uppercase);
		System.out.println("Lowercase letter : "+lowercase);
		System.out.println("Number : "+num);
		System.out.println("Special letter: "+special);
		
	}

}
