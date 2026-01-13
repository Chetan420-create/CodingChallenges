package arraychalange;

import java.util.Scanner;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		
		
		int[] elements = new int[size];
		
		
		for(int i=0 ; i<size;i++) {
			
			System.out.println("Enter integer "+(i+1)+" : ");
			int integer = sc.nextInt();
			
			elements[i] = integer;
		}
		
		int maxValue=elements[0];
		int secondMaxvalue=0;
		
		for(int e : elements) {
			if(e > maxValue ) {
				maxValue = e;
			}
		}
		
		System.out.println("Array");
		for(int e : elements) {
			
			if(secondMaxvalue < e && e < maxValue) {
				secondMaxvalue=e;
			}
			System.out.print(e+" ");
		}
		
		System.out.println();
		System.out.println("Max value : "+maxValue);
		System.out.println("Second max value : "+secondMaxvalue);
		
		sc.close();

	}

}
