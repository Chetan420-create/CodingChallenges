package arraychallenge3;
//You are given an array of integers.
//Write a Java program to count how many elements are greater than the first element of the array

import java.util.Scanner;

public class CountElementGreaterthanFirstElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[]  = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter elements ");
			arr[i] = sc.nextInt();
		}

		int count =0;
		for(int a : arr) {
			if(a > arr[0]) {
				count++;
			}
		}
		
		System.out.println("Number of elements greater than first element : "+count);
		sc.close();
	}

}
