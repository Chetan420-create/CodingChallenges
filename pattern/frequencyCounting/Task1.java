package pattern.frequencyCounting;

import java.util.HashMap;

public class Task1 {

	public static void main(String[] args) {
		// print dupliacate charecters 
		countFrequencyUsingMap("Banana");
	}
	
	public static void countFrequencyUsingMap(String str) {
		// 1. create frequency - use HashMap -> java.util.Hashmap;
		HashMap<Character, Integer> frequency = new HashMap<>();
		// {'a' : 3, 'b' :4}
		
		// 2. traverse string
		for(int i = 0; i < str.length() ; i++) {
			// char
			char ch = str.charAt(i);
			
			//3. increment count	
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}
		
		// printing
		for(Character ch : frequency.keySet()) {
			System.out.println(ch + " - " + frequency.get(ch));
		}
}
}
