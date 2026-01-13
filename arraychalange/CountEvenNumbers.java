package arraychalange;

import java.util.Scanner;

public class CountEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking input of size of an array
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		//initialize array off size 
		int[] sales = new int[size];
		
		//traversing array
		for(int i=0 ; i<size;i++) {
			//taking values from user
			System.out.println("Enter integer "+(i+1)+" : ");
			int integer = sc.nextInt();
			//adding values in an array
			sales[i] = integer;
		}
		
		System.out.println("Even Numbers : ");
		// Traversing array using for each
		for(int s : sales) {
			//check the number is even or odd
			if(s%2==0) {
				System.out.print(s + " "); //print even numbers 
			}
		}
		
		sc.close();
	}

}
