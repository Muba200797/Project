package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LengthandSearch {
	
	public static void main(String[] args) {
		int element=8,index=0;
		Boolean found=false;
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(5);
		intList.add(2);
		intList.add(8);
		intList.add(12);
		System.out.println(intList);
		
		System.out.println("Length of LinkedList: "+intList.size());
		
		for(int i=0;i<intList.size()-1;i++) {
			if(intList.get(i)==element) {
				index=i;
				found=true;
				break;
			}
		}
		if (found) {
			System.out.println("The element " +element+" is found at  index"+index);
		}
		else {
			System.out.println("Not found");
		}
		
		
	}

}
