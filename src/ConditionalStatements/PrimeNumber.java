package ConditionalStatements;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int p=29;
		int temp=0;
		
		for(int i=2;i<=p-1;i++)
		{
			if(p%i==0)
			temp=temp+1;
		}
		if(temp>0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("this is prime number");
		}
		
		// find prime numbers between 1 to 100
		for(int i=1;i<=100;i++)
		{
			
			int tempn = 0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				tempn=tempn+1;
			}
		
			if(tempn==0)
			{
				System.out.println(i);
			}
			else
			{
				tempn=0;
			}
	}

	}

}
