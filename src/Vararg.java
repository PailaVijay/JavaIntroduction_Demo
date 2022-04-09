
public class Vararg {

	
public static void sum(int...x)	
{
	int total=0;
	for(int y:x)
	{
		total=total+y;
	}
	System.out.println("Total sum: "+total);
	
}
   public static void  main(String[] args) {
		 sum();
		 sum(10,20);
		 sum(20,30,40);
		 sum(20,40,60);

	}

}
