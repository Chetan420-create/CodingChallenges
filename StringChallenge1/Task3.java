package StringChallenge1;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {
		// print frequnecy of each character
		
		//input string
		String input = "aabbc";
		
		Map<Character , Integer> count = new HashMap<Character,Integer>(); //create it for count
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i); // take each character
			
			//check char is repeat or not 
			if(count.containsKey(ch)) {
				count.put(ch,count.get(ch)+1); //increament its count
			}else {
				count.put(ch,1); // add to map
			}
			
			
		}
		
		
		//print frequency
		for(Map.Entry<Character , Integer> e: count.entrySet()) {
			System.out.println(e.getKey()+" - > "+e.getValue()); // print key and count
		}
		
		
	}

}
