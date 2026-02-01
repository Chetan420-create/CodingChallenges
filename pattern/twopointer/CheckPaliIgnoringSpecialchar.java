package pattern.twopointer;

public class CheckPaliIgnoringSpecialchar {

	public static void main(String[] args) {
		// check string is palindrome or not ignoring special characters
		
		System.out.println(isPalindromeIgnoringSpecialChar("mad!am#"));
	}
	
	public static boolean isPalindromeIgnoringSpecialChar(String str) {
		// new string 
		String newstr=" ";
		//loop to add letter , digit , white spaces in new string 
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				newstr = newstr+ch;
			}
		}
		str = newstr.replaceFirst("\\s", ""); //removing first space
		
		
		// check the string is palindrome or not
		boolean isPalidrom=false;
		
		int left=0; int right = str.length()-1;
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
		
		
		return isPalidrom;
		

	}

}
