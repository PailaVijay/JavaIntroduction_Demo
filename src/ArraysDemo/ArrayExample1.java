package ArraysDemo;



public class ArrayExample1 {

	public static void main(String[] args) {
		
	/*	int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;  */
		int a[]= {10,20,30,40,50};
		
		// for loop
	/*	for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}  */
		
		// for each... loop
		int sum = 0;
		for(int i:a)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
		
		
		

	}

}
