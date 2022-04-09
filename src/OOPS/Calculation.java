package OOPS;

public class Calculation {
	
	int a;
	int b;
	// method not take any parameter
/*	void sum()
	{
		System.out.println(a+b);
	}  */
	
	
	// parameterisation method
/*	void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	} */
	
	// method returning some value
	int sum()
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		// required for non parameterisation method
	/*	Calculation cal= new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();   */
		
		// required for parameterisation method
		
	/*	Calculation cal= new Calculation();
		cal.sum(200, 300);    */
		
		// Required for returning type
		Calculation cal= new Calculation();
		cal.a=100;
		cal.b=200;
		int r=cal.sum();
		System.out.println(r);
	}

}
