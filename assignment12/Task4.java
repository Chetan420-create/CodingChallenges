package assignment12;

public class Task4 {

	public static void main(String[] args) {
		// Sort array containing 0,1 and 2 without using library sort
		
		//Initialize array
		int arr[] = {2,0,2,1,1,0};
		// variable for length of array
		int l=arr.length;
		
		// loop till the element are not sort
		for(int i =0;i<l;i++) {
			
			// loop for changing element
			for(int j=0;j<l-1;j++) {
				
				// check the element are greater or not
				if(arr[j]>arr[j+1]) {
					// store big element in temporary variable 
					int temp = arr[j]; 
					arr[j]=arr[j+1];  // change element to first position
					arr[j+1]=temp;  // change second element with temp i.e first
				}
			}
		}
		
		//print array
		for(int k=0;k<l;k++) { 
			System.out.print(" "+arr[k]+" ");
		}

	}

}
