package revision;

import java.util.Arrays;

public class LengthofLongestString {

	public static void main(String[] args) {
		String[] array= {"Apple","Banana","Cat","Dog"};
		
		int maxlength=Arrays.stream(array).mapToInt(String::length).max().getAsInt();
		System.out.println("maxlength: "+maxlength);
		
		String name=Arrays.stream(array).filter(a->a.length()==maxlength).findFirst().get();
		System.out.println("name: "+name);

	}

}
