package arraychalenge2;

import java.util.Scanner;

//Given an integer array and a number X, check whether X is present in the array.
//Output:
//Print "Found" if element exists, else "Not Found"

public class CheckNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,4,5,9,27,17,23,98,99,55,47,32,19,28,45};
		
		System.out.println("Enter the number to search : ");
		int num = sc.nextInt();
		boolean found = false;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(num == arr[i]) {
				found=true;
				System.out.println("Found");
			}
			
		}
		
		if(!found) {
			System.out.println("Not found");
		}
		
		sc.close();
	}

}
