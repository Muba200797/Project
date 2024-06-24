package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1="abba";
		
		String reverse="";
		boolean status=false;
		
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		
		if(s1.equals(reverse)) {
			status=true;
		}
		if (status) {
			System.out.println("Palindrome");
		}

	}

}
