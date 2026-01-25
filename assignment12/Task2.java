package assignment12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// Return an array of unique elements present in both arrays
		
		// first array
		int num1[] = {1,7,2,2,1,4};
		//second array
		int num2[]	= {2,2,4,7};
		
		List<Integer> a = new ArrayList<>(); // new array list
		
		for(int i =0;i<num1.length;i++) { //loop for traversing first array
			
			for(int j=0;j<num2.length;j++) {  //loop for traversing first array
				
				// check the element is present in both arrays and not present in new array 
				if(num1[i] == num2[j] &&  !a.contains(num1[i]))
				{
					a.add(num1[i]);  // add unique element to array
				}
			}
		}
		
		//print array 
		for(int a1 : a) {
			System.out.print(a1+" ");
		}
				
	}

}
