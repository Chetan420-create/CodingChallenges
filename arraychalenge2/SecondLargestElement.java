package arraychalenge2;


// Find the second largest distinct element in the array.

public class SecondLargestElement {
	public static void main(String[] args) {
		
		int arr[] = {4,5,9,27,17,23,98,99,55,47,32,19,28,78}; 
		
		int max = 0;
		int scondMax = 0;
		
		for(int a : arr) {
			if(max < a) {
				max = a;
			}
		}
		
		for(int a : arr) {
			if(a >= scondMax && a < max) {
				scondMax = a;
			}
		}
		
		System.out.println("Max element : "+max);
		System.out.println("Second Max element : "+scondMax);
		
	}
}
