package ConditionalStatements;

public class ifCondition {

	public static void main(String[] args) {
		
		
		int age=20;
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
		System.out.println("Programe Exited");
	
	
	// find largest number between three
	
	int a=20,b=30,c=10;
	
	if(a>b && a>c)
	{
		System.out.println(" greater number is "+a);
	}
	if(b>a && b>c)
	{
		System.out.println(" greater number is "+b);
	}
	else
	{
		System.out.println("greater number is "+c);
	}
    System.out.println("exit from programe");
    
    // print leap year
    // divisible by 400 & 4 but not with 100
    
    int year=2016;
    
    if((year%400==0) || (year%4==0 && year%100!=0))
    {
    	System.out.println("2016 is a leap year");
    }
    else
    {
    	System.out.println("2016 is not leap year");
    }
    // Swapping  one variable value to another value
    
    int shirt=120;
    int pant=210;
    int dress;
    dress=shirt;
    shirt=pant;
    pant=dress;
    System.out.println(shirt);
    System.out.println(pant);
    // Swapping value without creating third variable
    
    int pen=20;
    int pencile=5;
    
    pen= pen+pencile;
    pencile=pen-pencile;
    pen=pen-pencile;
    
    System.out.println(pen);
    System.out.println(pencile);
  // provide calculation using calculator
    
    int no1=10,no2=20,result;
    String sys="*";
    switch(sys)
    {
    case "+" : result=no1+no2;System.out.println(result);break;
    case "-" : result=no1-no2;System.out.println(result);break;
    case "*" : result=no1*no2;System.out.println(result);break;
    case "/" : result=no1/no2;System.out.println(result);break;
    default : result=no1%no2;System.out.println(result);



    }
}
}
