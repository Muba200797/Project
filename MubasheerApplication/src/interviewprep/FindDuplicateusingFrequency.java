package interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateusingFrequency {
	public static void main(String[] args) {
		List<Employee2> empList=new ArrayList<Employee2>();
		generateEmp(empList);
		
		List<String> names=empList.stream().map(Employee2::getName).collect(Collectors.toList());
		
		//Finding frequency of each name
		Map<String, Long> mapEmps=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("mapempds:"+mapEmps);
		
		//finding duplicate elements using frequency, i.e,  entryset() used to get key value pairs in set format)
		Set<String>duplicateNames =mapEmps.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());
		
		System.out.println("duplicateNames: "+duplicateNames);
		
											//USing Collections.frequency() method
		//List<String> names=empList.stream().map(Employee2::getName).collect(Collectors.toList());
		
		Set<String> newnames=names.stream().filter(name->Collections.frequency(names, name)>1).collect(Collectors.toSet());
		
		System.out.println("Duplicate names using frequency method: "+newnames);
		
		//Finding frequency of each name
		Map<String, Long> namesfreq=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("namesfreq: "+namesfreq);
		
		Set<String> un=namesfreq.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toSet());
		
		Set<String> un1=names.stream().filter(name->Collections.frequency(names, name)>1).collect(Collectors.toSet());
		
	}
	
	public static void generateEmp(List<Employee2> empList) {

		Employee2 emp1 = new Employee2("Arun", "1", "Hyderabad",21);
		Employee2 emp2 = new Employee2("Mahesh", "2", "Noida",23);
		Employee2 emp3 = new Employee2("Vijay", "3", "Pune",25);
		Employee2 emp4 = new Employee2("Vijay", "4", "Bangalore",27);
		Employee2 emp5 = new Employee2("Kalyan", "5", "Bangalore",29);
		Employee2 emp6 = new Employee2("Arun", "6", "Bangalore",29);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
	}
}
