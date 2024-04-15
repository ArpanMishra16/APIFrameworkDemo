package resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class String1 {
	
	public static void main(String[] args) {
		
		//vowel();
		//vowelunique();
		vowelCount1();
		
	}
	public static void vowel() {
		int count = 0;
		String input = "Varanasi";
		String vowel =  "aeiou";
		char[] vowelChar = vowel.toCharArray();
		input = input.toLowerCase();
		char[] inputChar = input.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		for(Character c:vowelChar )
		{
			al.add(c);
		}
		
		for(Character car:inputChar )
		{
			if(al.contains(car))
			{
				System.out.print(car+ " ");
				count++;
			}
		}
		System.out.println(count);
		}
	
	public static void vowelunique() {
		String input = "Varanasi";
		input = input.toLowerCase();
	char[] inputChar =	input.toCharArray();
		char[] vowel = {'a','e','i','o','u'};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c: vowel) {
			map.put(c, 1);
		}
		for(Character car : inputChar) {
			if(map.containsKey(car)) {
				map.put(car, map.get(car)+1);
			}
			else {
				map.put(car, 1);
			}
		}
	Set<Character> set =	map.keySet();
	set.stream().filter(k->map.get(k)>1).forEach(v->System.out.println(v+" : "+map.get(v)));
		
	}
	
	public static void vowelCount1() {
		String input = "mozambique";
		input = input.toLowerCase();
		int count = 0;
		for(int i=0;i<=input.length()-1;i++)
		{
			char c =input.charAt(i);
			if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	

}
