package resources;

import java.util.ArrayList;

public class StringSolution {

	public static void  main(String[] args) {
		//System.out.println(reverseOnlyAlphabet("Arpan1256Mishra589667Varanasi"));
		reverse();
		}
	
	public static String reverseOnlyAlphabet(String input) {
		
		
		char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (Character.isLetter(charArray[left]) && Character.isLetter(charArray[right])) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return new String(charArray);
    }
	
	public static void reverse() {
		
		        String s = "Arpan1256Mishra589667Varanasi";
		 
		        char[] input = s.toCharArray();
		        int l = 0, r = input.length - 1;

		        while (l < r) {
		            if (!Character.isLetter(input[l]))
		                l++;
		            else if (!Character.isLetter(input[r]))
		                r--;
		            else {
		                char temp = input[l];
		                input[l] = input[r];
		                input[r] = temp;
		                l++;
		                r--;
		            }
		        }

		        System.out.println("Input string: " + new String(input));
		    }
	}



