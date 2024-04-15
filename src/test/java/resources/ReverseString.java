package resources;

public class ReverseString {

	public static void main(String[] args) {
		reverse1();
		reverse2();
		reverse3();

	}
	
	public static void reverse1() {
		String str = "Selenium";
		char[] string =str.toCharArray();
		String revstr = "";
		for(int i=str.length()-1;i>=0;i--) {
			
			revstr = revstr+ string[i];
		}
		System.out.println(revstr);
	}
	public static void reverse2() {
		String str = "Selenium";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}
	public static void reverse3() {
		String str = "Selenium";
		StringBuffer strBuffer = new StringBuffer(str);
		//strBuffer.append(str);
		System.out.println(strBuffer.reverse());
	}

}
