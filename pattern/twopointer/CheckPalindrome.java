package pattern.twopointer;

public class CheckPalindrome {

	public static void main(String[] args) {
		// Check palindrome ignoring case
		String str = "ChetannatehC";
		System.out.println(isPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {
		// initialization of boolean varible
		boolean isPalidrom=false;
		// Normalization
		str = str.toLowerCase();
		// to traverse form start and from end
		int left=0; int right = str.length()-1;
		//check until left is equal or greater than right
		while(left<right) {
			// compare
			if(str.charAt(left) == str.charAt(right)) {
				System.out.println(str.charAt(left) +" = "+ str.charAt(right));
				isPalidrom= true; // changing boolean to true 
			}else {
				// condition fail return false
				return false;
			}
			left++; // increase left to traverse toward right
			right--; // decrese right to traverse toward left
		}
		return isPalidrom;  // return boolean to know string is palindrome or not
	}

}
