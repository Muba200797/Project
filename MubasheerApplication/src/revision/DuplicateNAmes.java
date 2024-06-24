package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNAmes {

	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		List<String> names=newList.stream().map(Employee2::getName).collect(Collectors.toList());
		
		Set<String> set=new HashSet<String>();
		List<String> dnames=names.stream().filter(a->!set.add(a)).collect(Collectors.toList());
		System.out.println(dnames);
		
		List<String> dnames1=names.stream().filter(a->Collections.frequency(names, a)>1).collect(Collectors.toList());
		System.out.println(dnames1);

	}
	
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		newList.add(new Employee2("Kalyan", "6", "Bangalore",30));
		newList.add(new Employee2("Vijay", "7", "Bangalore",30));
		
	}
}
