package arraychalenge2;

// Find the maximum sum of consecutive elements in the array.

public class MaxSumOfConsecutiveNum {

	public static void main(String[] args) {
		int arr[] = {-2, 1,-3, 4,-1, 2, 1,-5, 4,8};
		
		int current = arr[0];
		int max = arr[0];
		
		for(int i = 0;i<=arr.length-1;i++) {
			current = Math.max(arr[i],current + arr[i]);
			max = Math.max(current, max);

		}
		
		
		System.out.println("max sum  : "+max);
		
	}

}
