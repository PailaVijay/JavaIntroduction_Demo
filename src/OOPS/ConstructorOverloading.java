package OOPS;

public class ConstructorOverloading {
    int a;
    int b;
    double c;
    
    
    ConstructorOverloading()
    {
    	a=100;
    	b=200;
    	c=99.99;
    }
    ConstructorOverloading(int x,double y)
    {
    	a=x;
    	c=y;
    }
    ConstructorOverloading(int x,int y,double z)
    {
    	a=x;
    	b=y;
    	c=z;
    }
   
    void Display()
    {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    }
	public static void main(String[] args) {
	//	ConstructorOverloading co= new ConstructorOverloading();
	//	ConstructorOverloading co= new ConstructorOverloading(10,20);
//		ConstructorOverloading co= new ConstructorOverloading(100,200,25.65);
	ConstructorOverloading co= new ConstructorOverloading(25,23.65);
		
		co.Display();

	}

}
