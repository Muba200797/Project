package interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Integer[] elearray= {1,2,3,4,5};
		
		List<Integer> intel=Arrays.asList(elearray);
		
		int prod=intel.stream().reduce(1, (a,b)->a*b);
		System.out.println(prod);
		
		int produ=Arrays.stream(elearray).reduce(1, (a,b)->a*b);
		System.out.println(produ);
		
		Optional<Integer> intprod=intel.stream().reduce((a,b)->a*b);
		System.out.println("intprod:  "+intprod);
		
		Integer[] numbers= {2,3,4};
		
		int mapmul=Arrays.stream(numbers).mapToInt(x->x).reduce((a, b)->(a*b)).getAsInt();
		System.out.println("mapmul: "+mapmul);
		
		
	}

}
