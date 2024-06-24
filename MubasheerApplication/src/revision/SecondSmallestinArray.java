package revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestinArray {

	public static void main(String[] args) {
		int[] array= {2,5,3,8,1,1};
		int[] array1= {4,5,3,9,6};
		findSecondSmallest(array);
		findCommonelements(array,array1);
		

	}

	private static void findCommonelements(int[] array, int[] array1) {
		List<Integer> common=Arrays.stream(array).filter(num->Arrays.stream(array1).anyMatch(n->num==n)).boxed().collect(Collectors.toList());
		
		System.out.println(common);
	}

	private static void findSecondSmallest(int[] array) {
		int num=Arrays.stream(array).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Not found"));
		System.out.println(num);
	}

}
