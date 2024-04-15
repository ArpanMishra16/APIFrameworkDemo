package resources;

import java.util.Arrays;

public class String2 {

	public static void main(String[] args) {
		missingElement2();
		

	}
	public static void missingElement() {
		int missing = 0;
		int[] input = {1,2,4,5,6,7,8,9,10,11};
		Arrays.sort(input);
		for(int i=0;i<input.length;i++) {
			if((input[i]!=i+1))
			{
				missing = i+1;
				break;
			}
		}
		System.out.println(missing);
	}
	public static void missingElement2() {
		int[] input = {1,2,4,5,6,7,8,9,10,11};
		int N = input.length+1;
		int expectedSum = (N*(N+1))/2;
		int actualsum = Arrays.stream(input).sum();
		int missing = expectedSum - actualsum;
		System.out.println(missing);
	}

}
