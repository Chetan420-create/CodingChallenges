package StringChallenge1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) {
		// Remove duplicate characters while maintaining order
		String s = "programming";
		String[] arr = s.split(""); // store each element  in array

		s=Arrays.asList(arr) // covert to list
				.stream()		//convert to characters stream into Stream<String>
				.distinct()		//new stream contain only unique element
				.collect(Collectors.joining());  // make single string
		
		System.out.println(s);
		
		
			
	}

}
