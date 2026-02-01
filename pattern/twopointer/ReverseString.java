package pattern.twopointer;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse String
		System.out.println(reverseStr("Chetan Bhankhede "));

	}
	
	public static String reverseStr(String str) {
		char arr[] = str.toCharArray();  // convert to array 
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			char temp = arr[l];  // store left value in temp 
			arr[l] = arr[r];  //add l index right element
			arr[r] = temp;  // add temp to right 
			
			r--;
			l++;
		}
		
		// return string
		return new String(arr);
		
	}

}
