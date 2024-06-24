package revision;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierC {

	public static void main(String[] args) {
		String[] array= {"Ant","Ball","Cat","Ant"};
		
		//Using Stream to traverse and print array and find the count of ant 
		Stream<String> ss=Arrays.stream(array);
		System.out.println("=======Printing Stream====");
		ss.forEach(a->System.out.println(a));
		
		Stream<String> s1=Arrays.stream(array);
		Long count=s1.filter(e->"Ant".equals(e)).count();
		System.out.println(count);
		
		//Supplier interface
		System.out.println("=======Supplier interface Stream====");
		Supplier<Stream<String>> sups=()->Stream.of(array);
		sups.get().forEach(e->System.out.println(e));
		
		Long count1=sups.get().filter(e->"Ant".equals(e)).count();
		System.out.println(count1);
	}

}
