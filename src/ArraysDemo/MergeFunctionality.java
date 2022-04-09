package ArraysDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeFunctionality {

	public static void main(String[] args) {
		// array which should be merged
		int[] src1= {12,9,14,58,13};
		int[] src2= {35,10,5,98,46};
		
		
		// creating new array
		int newArray[]= new int[src1.length + src2.length];
		
		// copy 1st array from 0 to src1.length
		System.arraycopy(src1, 0, newArray, 0,src1.length);
		// copy second array to new array
		System.arraycopy(src2, 0, newArray, src1.length, src2.length);
		// sort new array
		Arrays.sort(newArray);
		// display all the arrays
		System.out.println("Array1:"+ Arrays.toString(src1));
		System.out.println("Array2:"+ Arrays.toString(src2));
		System.out.println("Merged:"+ Arrays.toString(newArray));
		
		
		
		

	}

}
