package interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MutiplyArrayElements {
	public static void main(String[] args) {
		Integer[] elearray= {1,2,3,4,5};
		
		List<Integer> elelist=Arrays.asList(elearray);
		
		//without using optional class
		Integer prod=elelist.stream().reduce(1, (a,b)->a*b);
		System.out.println("Without using optional class: "+prod);
		
		//without using optional class and without converting to list
		Integer product=Arrays.stream(elearray).reduce(1, (a,b)->a*b);
		System.out.println("Without converting to list: "+product);
		
		//with using optional class
		Optional<Integer> output=elelist.stream().reduce((a,b)->a*b);
		System.out.println("With optional class: "+product);
		
		// Using mapToInt and reduce
		Integer[] numbers = {2, 3, 4, 5};

		int productusingmaptoInt = Arrays.stream(numbers)
		        .mapToInt(x -> x) // Convert stream to int primitives (x is already an int)
		        .reduce((a, b) -> a * b) // Use lambda for multiplication
		        .getAsInt();
		System.out.println("ProductusingmaptoInt: " + productusingmaptoInt);
		
		//using forEach
		Integer foreachmul=1; //because the multiply should not be result in Zero
		
		for(int i:elelist) {
			foreachmul= i*foreachmul;
			
		}
		System.out.println("multiply using foreach: "+foreachmul);

	}
	
	
	

}
