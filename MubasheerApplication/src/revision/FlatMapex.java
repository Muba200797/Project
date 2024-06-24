package revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapex {

	public static void main(String[] args) {
		List<String> a=Arrays.asList("Apple");
		List<String> b=Arrays.asList("Bananna");
		List<String> c=Arrays.asList("cat");
		List<String> d=Arrays.asList("dog");
		
		List<List<String>> e=Arrays.asList(a,b,c,d);
		
		List<String> g=e.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		System.out.println(g);
		
	}

}
