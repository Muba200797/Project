package test;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers {

	public static void main(String[] args) {
		Random r=new Random();
		IntStream i=r.ints(10);
		i.forEach(System.out::println);
	}

}
