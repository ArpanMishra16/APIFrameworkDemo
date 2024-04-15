package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class JavaStandAlone {

	public static void main(String[] args) {
		//getAplhabet("ar12262vghcghvbn51546515");
		dupCount("Arpanxrpan");
		//randomNumner(85);
		//bubbleSort();
		

	}
	
	public static void getAplhabet(String s)
	{ 
		s = s.toLowerCase();
		char[] car =	s.toCharArray();
		String str = "";
		for(int i=0; i<car.length;i++)
		{
			if(Character.isAlphabetic(car[i])) {
				
				str = str+car[i];
			}
			
		}
		System.out.println(str);
	}
	
	public static void dupCount(String s)
	{
		s =s.toLowerCase();
	char[] words =	s.toCharArray();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(Character w: words) {
		if(map.containsKey(w))
		{
			map.put(w, map.get(w)+1);
		}
		else
		{
			map.put(w, 1);
		}
		
	}
Set<Map.Entry<Character, Integer>> set =	map.entrySet();
for(Map.Entry<Character, Integer> entry : set ) {
	if(entry.getValue()>1)
	{
		System.out.println(entry.getKey()+ " - "+entry.getValue());
	}
	
}

Iterator<Entry<Character, Integer>> it =	map.entrySet().iterator();
while(it.hasNext()) {
	Entry<Character, Integer> entry =it.next();
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());}


		
		
	}
	
	public static void randomNumner(int n) {
		Random rand = new Random();
		System.out.println(rand.nextInt(n));
		}
	
	public static void bubbleSort() {
		int a[] = {5,2,4,7,9,6,3,1,8};
		Integer b[] = {10,55,26,2,758,54};
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		int l = a.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] =temp;
				
			}}
		}
		System.out.println(Arrays.toString(a));
	}

}
