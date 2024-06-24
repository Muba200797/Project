package interviewprep;

import java.util.Arrays;
import java.util.List;

public class Testing {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,5,7,8);
		int sum=l.stream().filter(n->n%2==0).map(n1->n1*n1).reduce(0, Integer::sum);
		System.out.println(sum);
		
	}
}
