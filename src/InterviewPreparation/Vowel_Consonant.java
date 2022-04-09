package InterviewPreparation;

public class Vowel_Consonant {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char ch='m';
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u')
		{
			
			System.out.println(ch+": is vowel character");
		}
		else
		{
			System.out.println(ch+": is consonant");
		}

		// find vowel using switch 
		
	   char cha= 'h';
	   
	   switch(cha)
	   {
	   case 'a': 
	   case 'e':
	   case 'i':
	   case 'o':
	   case 'u':
		
		   System.out.println(cha +": is vowel");
		   break;
	   default : 
		   System.out.println(cha + ": is consonant");
		
	   
	   }
		
	
	
	}

}
