package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseaList {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,3,4,5,7,8);
		
		List<Integer> b=new ArrayList<Integer>();
		
		for(int i=a.size()-1;i>0;i--) {
			b.add(a.get(i));
			
		}
		System.out.println(b);

	}

}
