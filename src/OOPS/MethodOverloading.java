package OOPS;

public class MethodOverloading {
	
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)
	{

		
		System.out.println(x+y+z);
	}
	void sum(int x,double y)
	{

		
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		
		
		MethodOverloading mo= new MethodOverloading();
		mo.sum(); // call the 1st method
		mo.sum(100, 200);// call the second method
		mo.sum(20, 30, 50);// call the 3rd method
		mo.sum(50, 50.50);// call the 4th method
		

	}

}
