package arraychallenge3;

// check the elements in an array are unique or elements are unique 

public class CheckUniqueArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,8,8};
		boolean unique = false;
		
		for(int i =0 ; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					unique = true;
				}
			}
		}
		
		if(unique) {
			System.out.println("array is not unique");
		}else {
			System.out.println("Unique array");
		}
	}

}
