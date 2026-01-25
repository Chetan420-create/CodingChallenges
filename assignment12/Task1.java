package assignment12;

public class Task1 {

	public static void main(String[] args) {
		// Give an array numbers , moves all 0 s to the end while maintaining the relative order of non zero elements
		
		// initialize array
		int arr[] = {0,1,0,3,0,12,0};
		//initialize variable
		int c =0 ;
		
		//new array of length arr.length
		int newarr[] = new int[arr.length];
		
		//traversing array
		for(int i =0;i<arr.length;i++) {
			//check non zero element
			if(arr[i]!=0) {
				newarr[c] = arr[i]; //add non zero element to new array in sequence
				c++;  // increment variable by 1
			}
		}
		
		// traversing new array from c 
		for(int j=c;j<=arr.length-1;j++) {
			newarr[c]=0; // adding 0 in last indexes
			c++; //increment until length not equal to arr.length
		}
		
		//print new array
		for(int e : newarr) {
			System.out.println(e);
		}
	}

}
