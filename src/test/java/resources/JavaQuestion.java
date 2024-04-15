package resources;

import java.util.Scanner;

public class JavaQuestion {

	public static void main(String[] args) {
		//ReverseWord();
		swapString();

	}
	
	public static void wordcount(){
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
	String str =	sc.nextLine();
	int count =1;
	for(int i=0;i<str.length()-1;i++) {
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
			
			count++;
		}
		
	}
	System.out.println(count);
		
	}
	
	public static void ReverseWord() {
		String str = "Java Automation using Selenium";
		String rev_str = "";
	String str1[]	= str.split(" ");
	/*for(String w: str1) {
		String str_revWord = "";
		for(int i= w.length()-1;i>=0;i--) {
			str_revWord = str_revWord + w.charAt(i);
		}
		rev_str = rev_str+str_revWord+" ";
	}*/
	for(String w:str1) {
		StringBuilder sw = new StringBuilder(w);
		sw.reverse();
		rev_str = rev_str+sw.toString()+" "; 
	}
	System.out.println(rev_str);
	}
	
	public static void swapString() {
		String str1 = "Arpan";
		String str2 = "Mishra";
		str1 = str1+str2;
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str2.length());
		 str2 = str1.substring(0, (str1.length()-str2.length()));
		 str1 = str1.substring(str2.length());
		 
		 System.out.println(str1);
		 System.out.println(str2);
		
		
		
		
		
		
		
	}
		}
