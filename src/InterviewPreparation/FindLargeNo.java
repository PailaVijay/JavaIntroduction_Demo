package InterviewPreparation;

public class FindLargeNo {

	public static void main(String[] args) {
	
		
		int a=10;
		int b=20;
		
		int largeNo= a>b ? a:b;
		
		System.out.println(largeNo);
		
		String name= "VijHayg@#1235hfghWE";
		int upperCase= 0;
		int lowerCase= 0;
		int special=0;
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upperCase++;
			}
			else if(ch>='a' && ch<='z')
			{
				lowerCase++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Uppercae:"+upperCase);
		System.out.println("LowerCase:"+lowerCase);
		System.out.println("Special:"+special);
	}

}
