package StringChallenge1;



public class Task2 {

	public static void main(String[] args) {
		// Find first non repeating characters in a string
		
		// input string 
		String input = "Chetan Bhankhede"; 
		// Variable to store  first non-repeating character
        char firstNonRepeatChar = 0; 
     // considering non repeating character is not found
        boolean found = false; 

        // Outer loop to travel  character of  string
        for (int i = 0; i < input.length(); i++) {
            boolean isRepeating = false; // consider if the current character is not repeating
            
         // current character
            char currentChar = input.charAt(i); 

            // Inner loop compares with current character 
            for (int j = 0; j < input.length(); j++) {
                // do not compare the character with itself
                if (i != j && currentChar == input.charAt(j)) {
                    isRepeating = true; // the character is repeating
                    break; // Exit inner loop if char is repeat
                }
            }

            // If after checking all  characters, it's not repeating
            if (!isRepeating) {
                firstNonRepeatChar = currentChar; // Store 1st character
                found = true; // Set it true
                break; // Exit the outer loop 
            }
        }

        // Print 
        if (found) {
            System.out.println("The first non repeated charcter is: " + firstNonRepeatChar);
        } else {
            System.out.println("There is no non repeating character in the string."+input);
        }
	    }
		
		

	}


