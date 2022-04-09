package ConditionalStatements;

import java.util.ArrayList;

public class NaturalNumbers {

	public static void main(String[] args) {

		int[] avg= {5,10,15,20,25};
		float sum=0;
		
		// compute sum
		int i=0;
		while(i<avg.length)
		{
			sum=sum += avg[i];
			i++;
			
		}
		
		float average= sum/avg.length;
		System.out.println("Average = "+average);
		
		// using for loop
		
		int[] number=  {1,2,3,4,5,6,7,8,23};
		float Tsum=0;
		
		for(int num:number)
		{
			Tsum= Tsum +=num;
			
			
		}
		float Avg= Tsum/number.length;
		System.out.println("Average = "+Avg);
		
		// finding Average no using ArrayList
		
		ArrayList<Integer> no= new ArrayList<Integer>();
		float totalSum=0;
		no.add(28);
		no.add(36);
		no.add(23);
		no.add(51);
		
		for(int n:no)
		{
			totalSum= totalSum+=n;
		}
		float Avg1= totalSum/no.size();
		System.out.println("Average= "+Avg1);
		
	}

}
