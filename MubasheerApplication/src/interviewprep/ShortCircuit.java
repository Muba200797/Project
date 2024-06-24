package interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShortCircuit {
	
	public static void main(String[] args) {
		List<Employee3> empList=new ArrayList<Employee3>();
		
		empList.add(new  Employee3("Arun", 1));
		empList.add(new Employee3("Mahesh", 2));
		empList.add(new Employee3("Mahesh", 3));
		empList.add(new Employee3("Vijay", 4));
		
		
		//FindFirst
		Employee3 emp=empList.stream().filter(name->name.getName().contains("Mahesh")).findFirst().get();
		
		System.out.println("FindFirst: "+emp);
		
		//FindAny
		Employee3 emp1=empList.stream().filter(name->name.getName().contains("Mahesh")).findAny().get();
		System.out.println("FindAny: "+emp1);
		
		//anyMatch
		Boolean anymatch=empList.stream().anyMatch(name->name.getName().contains("Mahesh"));
		System.out.println("anymatch: "+anymatch);
		
		//allMatch
		Boolean allmatch=empList.stream().allMatch(name->name.getName().contains("new"));
		System.out.println("allmatch: "+allmatch);
		
		//noneMatch
		Boolean noneMatch=empList.stream().noneMatch(name->name.getName().contains("new"));
		System.out.println("noneMatch: "+noneMatch);
	}

}
