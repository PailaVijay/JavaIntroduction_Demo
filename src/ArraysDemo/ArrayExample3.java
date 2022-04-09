package ArraysDemo;

public class ArrayExample3 {

	public static void main(String[] args) {
		 
	/*	Object a[]=new Object[5];
		
		a[0]=21;
		a[1]="Vijay";
		a[2]=6.90;
		a[3]=true;
		a[4]='A';
		for(Object multi:a)
		{
			System.out.println(multi);
		}  */
		
	/*	Object a[]= {21,"Vijay",6.90,true,'A'};
		 for(Object multi:a)
		 {
			 System.out.println(multi);
		 }   */
		 // two Dimensional Array
		 
		Object a[][]= {{"Vijay",21,6.90,'A',true},{"Kumar",22,8.50,'Z',false}};
		
		
		
		for(Object i[]:a)
		{
			for(Object  j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
