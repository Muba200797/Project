package revision;

import java.util.Arrays;
import java.util.List;

public class LengthandElementSearch {

	public static void main(String[] args) {
		List<Integer> a= Arrays.asList(1,2,3,4,5,6,7,9);
		
		List<Integer> b=a.reversed();
		
		System.out.println(b);
		int index=0,element=7;
		boolean found=false;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==element) {
				index=i;
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("element is found at: "+index);
		}
	}

}
