package ArraysDemo;

public class ArrayExample2 {

	public static void main(String[] args) {
		 String s[]=new String[3];
		 s[0]="Ram";
		 s[1]="Sita";
		 s[2]="Laxman";
		 
          System.out.println( s.length);
          
          for(String name:s)
          {
        	  System.out.println(name);
          }
	}

}
