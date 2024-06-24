package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {
	public static void main(String[] args) {
		//1St Way
		List<Integer> firstList=new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);
		firstList.add(4);
		firstList.add(5);
		
		List<Integer> secondList=new ArrayList<Integer>();
		firstList.add(9);
		firstList.add(11);
		firstList.add(13);
		firstList.add(14);
		firstList.add(56);
		
		
		firstList.addAll(secondList);
		System.out.println("Using ADdALL: "+firstList);
		
		//2nd Way
		
		List<Integer> list=new ArrayList<Integer>();
		list=Stream.concat(firstList.stream(), secondList.stream()).collect(Collectors.toList());
		
		System.out.println("USing java8: "+list);
		
		//3rd way
		List<Integer> Thirdlist=new ArrayList<Integer>();
		for(int i=0;i<secondList.size();i++) {
			Thirdlist.add(secondList.get(i));
		}
		
		
		
	}

	
	
	
}
