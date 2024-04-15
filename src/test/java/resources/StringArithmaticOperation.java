package resources;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArithmaticOperation {

	public static void main(String[] args) {
		
		int a[] = {45,256,41,85,63,89,25};
		Arrays.sort(a);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i: a) {
			al.add(i);
		}
		al.stream().forEach(k->System.out.print(k+" "));
		System.out.println();
		System.out.println(al.get(al.size()-1));
		System.out.println(al.get(al.size()-2));
		System.out.println(al.indexOf(256));

	}

}
