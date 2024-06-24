package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String s="olleh";
		
		String reversed="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reversed+=s.charAt(i);
		}
		System.out.println("Reversed String: "+reversed);
	}

}
