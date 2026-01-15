package arraychallenge3;

// count positive , negative , zero integers in an array

import java.util.Scanner;

public class PositiveNegativeZeroCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[]  = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter elements ");
			arr[i] = sc.nextInt();
		}
		
		int positive = 0 , negative = 0, zero =0;
		for(int a : arr ) {
			if(a == 0) {
				zero++;
			}else if(a < 0){
				negative++;
			}else {
				positive++;
			}
		}
		 
		
		System.out.println("Positive count : "+positive);
		System.out.println("Negative count : "+negative);
		System.out.println("Zero count : "+zero);
		
		sc.close();

	}

}
