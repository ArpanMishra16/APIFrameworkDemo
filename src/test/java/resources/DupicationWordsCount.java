package resources;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupicationWordsCount {

	public static void main(String[] args) {
		wordCount("My name is Arpan Mishra is Arpan mishra MIshra ARpAN");
		//charcterCount("Arpanmishra");
	}
	
	public static void wordCount(String str) {
		
		str = str.toLowerCase();
	String[] words = str.split(" ");
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(String word: words) {
		if(map.containsKey(word)) {
			map.put(word, map.get(word)+1);
			
		}
		else {
			map.put(word, 1);
		}
	}
	
	Set<String> set =   map.keySet();
	set.stream().filter(k->map.get(k)>1).forEach(v-> System.out.println(v +":"+map.get(v)));
	for(String w:set) {
		if(map.get(w)>1) {
			//System.out.println(w +" : "+map.get(w));
		}
	}
  }
	
	public static void charcterCount(String str) {
		
		str =str.toLowerCase();
		char[] charcter =str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c: charcter) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
	Set<Character> set =	map.keySet();
	for(Character car: set) {
		if(map.get(car)>1) {
			System.out.println(car+" : " +map.get(car));
		}
	}
		
	}

	
				
	}


