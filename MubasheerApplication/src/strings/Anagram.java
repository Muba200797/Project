package strings;

import java.util.Arrays;


// Also called permutation of strings
public class Anagram {

	public static void main(String[] args) {
		String s1="Keep",s2="peeka";
		boolean status=false;
		
		if(s1.length()!=s2.length()) {
			status=false;
		}
		
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//status=Arrays.equals(ch1, ch2);
		for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                status=true;
            }
        }
		
		if(status) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not anagram");
		}
	}

}
