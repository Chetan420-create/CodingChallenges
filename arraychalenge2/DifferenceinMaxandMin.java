package arraychalenge2;

//Find the difference between the maximum and minimum element in the array.

public class DifferenceinMaxandMin {

	public static void main(String[] args) {
		
		int arr[] = {14,25,9,27,17,23,98,99,55,47,32,19,28,78}; 
		
		int max = 0;
		int min = arr[0];
		
		for(int e : arr) {
			if(e > max) {
				max = e;
			}
			
			if(e < min) {
				min = e;
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("Difference : "+(max - min));

	}

}
