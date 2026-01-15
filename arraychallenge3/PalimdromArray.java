package arraychallenge3;
//Write a Java program to check whether the given array is a palindrome.

public class PalimdromArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,7,2,1};
		
		int l = arr.length-1;
		boolean p =true;
		for(int i = 0 ; i<=(arr.length%2)+1;i++) {
			if(arr[i]!=arr[l]) {
				p=false;
			}
			l--;
		}
		
		if(p) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
