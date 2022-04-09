package ConditionalStatements;

public class StarPattern {

	public static void main(String[] args) {
	// printing increment *
	/*	for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		} */
		
		// printing decrement *
	/*	 for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" * ");
			 }
			 System.out.println();
		 }   */
		 
		 // printing both styles
		 
/*		 for(int i=1;i<=5;i++)
		 {
			 
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" * ");
			 }
			 System.out.println();
		   
		 }
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=4;j>=i;j--)
			 {
				 System.out.print(" * ");
			 }
			 System.out.println();
		 }   */
		
		// reverse pattern with spaces
/*		for(int i=1;i<=5;i++)
		{
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}    */
		
		
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}    */
		
/*		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}   */
		
		// triangle pattern-1
		
/*		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}   */
		
	// printing pyramid pattern
		
/*		for(int i=0;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
		
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		
	   }   */
		
		// Reverse pyramid pattern
		
		for(int p=1;p<=4;p++)
		{
			for(int q=1;q<=p;q++)
			{
				System.out.print(" ");
			}
			for(int r=4;r>=p;r--)
			{
				System.out.print("*");
			}
			for (int s=3;s>=p;s--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

