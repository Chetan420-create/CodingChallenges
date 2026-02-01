package pattern.frequencyCounting;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {
		// most frequent character
		String str = "banananna";
		System.out.println(mostfrequntChar(str));
		

	}
	
	public static char mostfrequntChar(String str) {
		HashMap<Character , Integer> map = new HashMap<>();
		
		char ch1 =' ';
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
			
		}
		
		int g=0;
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue()>g) {
				g=m.getValue();
				ch1=m.getKey();
			}
		}
		
		return ch1;
	}

}
