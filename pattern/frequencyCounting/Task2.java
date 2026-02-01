package pattern.frequencyCounting;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		// Find first non repeating character
		String str = "aallhuu";
		System.out.println(FirstnonRepeatChar(str));

	}
	
	public static char FirstnonRepeatChar(String str) {
		LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue()==1) {
				return m.getKey();
			}
		}
		return ' ';
	}

}
