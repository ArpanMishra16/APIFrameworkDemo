package stepDefinations;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import org.json.JSONObject;

public class InterviewQuestion {

	public static void main(String[] args) {
		//createPayload();
		//q1();
		primeNumber(1,50);
		//carNumber();
		//stringAppend();
		//reverseOnlyCharacter();
		//reverseCharacterOnly();
		//reverseWords();
		//numberDivisibleBy10(1, 1000);
		//anagram("Car", "Rdc");
		

	}
	public static void createPayload() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "john");
		map.put("age", 30);
		map.put("car", null);
		
		JSONObject jo = new JSONObject(map);
		//jo.put("name", "John");
		//jo.put("age", 30);
		jo.put("car", JSONObject.NULL);
		
		System.out.println(jo);
		}
	public static void q1() {
		
		int[] a = {4,5,5,7,6,6,7,4,9,5};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i:a) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
Set<Integer> set = map.keySet();
set.stream().forEach(k-> System.out.println(k));
	}
	public static void primeNumber(int n1, int n2) {
		boolean isPrime = true;
		for(int i=n1;i<=n2;i++) {
			isPrime = true;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		
	}
	public static void carNumber() {
		String str = "5450595638154862";
		String str1 = str.substring(0, 6);
	String 	str2 = str.substring((str.length()-4), str.length());
	String str3 = str.substring(6,(str.length()-4));
	
str3 = str3.replaceAll("[0-9]", "*");
//System.out.println(str3);
String finalString = str1+str3+str2;
System.out.println(finalString);
char[] car = finalString.toCharArray();

StringBuilder sb = new StringBuilder();
for(int i=0;i<car.length-1;i++) {
	sb.append(car[i]);
	if(i==3 || i==7 || i==11) {
		sb.append("-");
		sb.append(car[i]);
	}
	
}
System.out.println(sb.toString());
	}
	public static void stringAppend() {
		String[] strArray = { "Rama", "Test", "Type", "Tata", "Varanasi"};
		int maxLength = 0;
		for(String s: strArray) {
			maxLength = s.length();
			}
		String result = "";
		for(int i=0;i<maxLength;i++) {
			for(String str: strArray) {
				if(i<str.length()) {
					result = result +str.charAt(i);
				}
			}
		}
		System.out.println(result);
	}
	public static void reverseOnlyCharacter() {
		String input = "testing 123selenium 456automation";
		System.out.println("input string is "+input);
		StringBuilder result = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<input.length();i++) {
		char c = input.charAt(i);
		if(Character.isDigit(c)) {
			while(i<input.length() && Character.isDigit(input.charAt(i))) {
				temp = temp.append(input.charAt(i));
				i++;
				}
			result.append(temp);
			temp.setLength(0);
			i--;
			}
		else {
			temp.insert(0, c);
			
		}
		}
		result.append(temp);
		System.out.println(result.toString());
		}
    public static void reverseCharacterOnly() {
		String s = "My name is123 Arpan Mishra";
		StringBuilder sb = new StringBuilder(s);
		//System.out.println(sb.insert(10, 123));
		//s = sb.toString();
		StringBuilder finalStr = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if(Character.isDigit(c)) {
				while(i<s.length() && Character.isDigit(s.charAt(i))) {
				temp =	temp.append(s.charAt(i));
					i++;
				}
				finalStr.append(temp);
				temp.setLength(0);
				i--;
				
				
			}
			else {
				temp.insert(0, c);
			}
		}
finalStr =		finalStr.append(temp);
System.out.println(finalStr.toString());
		}
    public static void reverseWords() {
    	String s = "My name is123 Arpan Mishra";
    	String rev = "";
    	 StringBuilder sb = new StringBuilder(s);
    	 sb.reverse();
    	 System.out.println(sb.toString());
    String[] strArray =	s.split(" ");
    System.out.println(strArray.length);
    for(int i = strArray.length-1;i>=0;i--) {
    	rev = rev+ strArray[i] + " ";
    }
    System.out.println("reverse String is: "+rev);
    }
    public static void numberDivisibleBy10(int a, int b) {
    	
    	for(int i=a;i<=b;i++) {
    		if(i%10==0) {
    			System.out.println(i);
    		}
    	}
    	
    	
    	
    	
    	
    }
    public static void anagram(String s1, String s2) {
    	s1 = s1.toLowerCase();
    	s2 = s2.toLowerCase();
    	int n1 = s1.length();
    	int n2 = s2.length();
    	boolean isAnagram = false;
    	if(n1!=n2) {
    		isAnagram = false;
    		
    	}
    	char[] str1 = s1.toCharArray();
    	char[] str2 = s2.toCharArray();
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	if(Arrays.equals(str1, str2)) {
    		isAnagram = true;
    	}
    	else {
    		isAnagram = false;
    	}
    	
    	
    	if(isAnagram==true) {
    		System.out.println("both strings are anagram");
    	}
    	else {
    		System.out.println("strings are not anagram");
    	}
    	}
    	}

