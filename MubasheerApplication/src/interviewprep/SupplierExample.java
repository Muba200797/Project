package interviewprep;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {
		String[] inputArray= {"Ant","ball","cat","dog","Ant"};
		
		//if i dont want to convert to List
		//Stream<String> inputStream=Arrays.stream(inputArray);
		
		//Creating a stream
//		Stream<String> inputStream=Arrays.asList(inputArray).stream();
//		inputStream.forEach(e->System.out.println(e));
//		//print the count of Ant, Can I Reuse the stream, check below
//		long count=inputStream.filter(x->"Ant".equals(x)).count();
//		System.out.println(count);
		
		Supplier<Stream<String>> inputStream= ()->Stream.of(inputArray);
		System.out.println("=======");
		inputStream.get().forEach(a->System.out.println(a));
		//Reusing stream using Supplier for count of the Ant
		System.out.println("=======");
		long count=inputStream.get().filter(x->"Ant".equals(x)).count();
		System.out.println("Count of Ant: "+count);
		
		
	}
	
	
	

}
