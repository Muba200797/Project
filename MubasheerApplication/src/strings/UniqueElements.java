package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		String s1="hello";
		boolean value=true;
		
		Set<Character> hashset=new HashSet<>();
		
		for(int i=0;i<s1.length();i++) {
			if(hashset.contains(s1.charAt(i))) {
				value=false;
				break;
			}
			else {
				hashset.add(s1.charAt(i));
			}
		}
		System.out.println(hashset);
		
	}
	

}
