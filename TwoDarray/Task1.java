package TwoDarray;

//Count the number of even and odd number present in 2D array 

public class Task1 {

	public static void main(String[] args) {
		
		//initialize array
		int arr[][]= {{2,2},{1,2},{3,4}};
		
		//initialize count
		int even=0 , odd=0;
		
		//outer loop for rows
		for(int r=0;r<arr.length;r++) {
			
			//inner loop for column
			for(int c=0;c<arr.length-1;c++) {
				
				if(arr[r][c]%2==0) {			//check condition for even number
					even++;			//increase count of even number
				}else {
					odd++;		//increase count of odd number
				}
			}
			
		}
		
		//print count
		System.out.println("even count "+even);
		System.out.println("odd count "+odd);
	}

}
