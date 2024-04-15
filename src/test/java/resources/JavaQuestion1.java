package resources;

public class JavaQuestion1 {

	public static void main(String[] args) {
		reverse();

	}
	
	public static void reverse() {
		
		String s = "My Name is Arpan Mishra";
		String[] str = s.split(" ");
		String revString = "";
		for(String st: str) {
			String rev_word = "";
			for(int i=st.length()-1;i>=0;i--) {
				rev_word = rev_word +st.charAt(i);
			}
			revString = revString+rev_word+" ";
		}
		System.out.println(revString);
		
		
	}

}
