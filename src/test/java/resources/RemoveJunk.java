package resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveJunk {

	public static void main(String[] args) {
		String s ="Arpan123466Mishra77845Varanasi";
	s=	s.replaceAll("[^a-zA-Z]","");
		//System.out.println(s);
		 String str1 = "1,2,3,a,5,1,4,5,,9,9,9,9,9,9";
	int sum =0;	 
	char[] car =	 str1.toCharArray();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(Character c: car) {
		if(Character.isDigit(c)) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
	}
Set<Character> set = map.keySet();
for(Character cc : set) {
	sum = sum + Integer.parseInt(String.valueOf(cc));
	
}
System.out.println(sum);
	

	

	}}


