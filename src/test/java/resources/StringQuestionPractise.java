package resources;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StringQuestionPractise {

	public static void main(String[] args) {
		wordCount();

	}
	public static void wordCount() {
		String str = "aabbccccttttssssbb";
	char[] c =	str.toCharArray();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(Character car: c) {
		if(map.containsKey(car)) {
			map.put(car, map.get(car)+1);
			
		}
		else {
			map.put(car, 1);
		}
	}
	
	map.forEach((k,v)->System.out.print(k+""+v));
	System.out.println();
	
Iterator<Entry<Character, Integer>>	 entrySet =map.entrySet().iterator();
while(entrySet.hasNext()) {
Entry<Character, Integer>	entry =entrySet.next();
System.out.print(entry.getKey()+""+entry.getValue());
}
		
		
		
	}

}
