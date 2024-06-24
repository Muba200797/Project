package interviewprep;

import java.util.Arrays;

public class SecondsmallestofArray {
	
	public static void main(String[] args) {
		int[] numbers= {5,2,8,3,1,1};
		findSecondSmallest(numbers);
		
	}

	private static void findSecondSmallest(int[] numbers) {
		// distinct to remove duplicate elements and else throw if we dont have more than 1 element
		int secondsmallest=Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("It doesnt have any second smallest element"));
		
		System.out.println("secondsmallest: "+secondsmallest);
		
		int secondsma=Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().getAsInt();
		System.out.println(secondsma);
	}	

}
