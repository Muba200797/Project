package revision;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MultiplyArrayElements {

	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		
		//List<Integer> l=Arrays.asList(arr);
		
		int prod=Arrays.stream(arr).reduce(1, (a,b)->(a*b));
		
		System.out.println(prod);
		
		Optional<Integer> prod1=Arrays.stream(arr).reduce((a,b)->(a*b));
		System.out.println("prod1: "+prod1);
	}

}
