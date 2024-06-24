package revision;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseInplaceArray {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5};
		ReverseInPlace(array1);

	}

	private static void ReverseInPlace(int[] array1) {
		
		IntStream.range(0, array1.length-1).forEach(i->{
			
			
			int temp=array1[i];
			array1[i]=array1[array1.length-i-1];
			array1[array1.length-i-1]=temp;
		});
		System.out.println("reversed: "+Arrays.toString(array1));
		
	}

}
