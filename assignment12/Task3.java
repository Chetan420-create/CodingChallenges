package assignment12;

public class Task3 {

	public static void main(String[] args) {
		// Check if String 1 is a rotation of String 2
		
		String s1 = "ABCD"; // initialize first string
		String s2 = "BCDA";	// initialize 2nd string
		
		s1 = s1.concat(s1);  // concatinating first string with itself
		
//		check the second is contains in first concatinating string
		if(s1.contains(s2) && s2.length() == (s1.length()/2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}

}
