package arraychalange;

public class ReverseArray {

	public static void main(String[] args) {
	
		int size = 5;
		
		int arr[] = {2,4,6,8,9};
		
		int temp[] = new int[size];
		int l = temp.length;
		
		for(int i=0;i<arr.length;i++) {
			temp[( l- 1)] = arr[i];
			l--;
			
		}
		
		for(int a : temp) {
			System.out.print(a+" ");
		}

	}

}
