package interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Commonelements {
	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5};
		int[] array2= {4,5,6,7,8};
		String[] strarr= {"Apple","Banana","Avacado","Apricot","Grapes"};
		
		findCommonElements(array1,array2);
		reverseAnArrayInPlace(array1);
		findlengthofLongestString(strarr);
	}

	private static void findlengthofLongestString(String[] strarr) {
		// TODO Auto-generated method stub
		int maxLength=Arrays.stream(strarr).mapToInt(string->string.length()).max().orElse(0);
		System.out.println("lengthofLongestString: "+maxLength);
		
	}

	private static void reverseAnArrayInPlace(int[] array1) {
		
		IntStream.range(0, array1.length/2).forEach(i->{
			int temp=array1[i];
			array1[i]=array1[array1.length-i-1];
			array1[array1.length-i-1]=temp;
			
		}		
);
		System.out.println("reverseelements: "+Arrays.toString(array1));
		
	}

	private static void findCommonElements(int[] array1, int[] array2) {
		
		List<Integer> commonele=Arrays.stream(array1).filter(num->Arrays.stream(array2).anyMatch(array2num->array2num==num)).boxed().collect(Collectors.toList());
		System.out.println("Commonelements: "+commonele);
		
	}
	
	

}
