package revision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		String s="Hello Hi";
		Set<Character> unique=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			unique.add(s.charAt(i));
		}
		System.out.println(unique);

	}

}
