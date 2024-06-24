package revision;

import java.util.ArrayList;import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import interviewprep.Employee2;

public class FindFreqofName {

	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		List<String> names=newList.stream().map(Employee2::getName).collect(Collectors.toList());
		System.out.println(names);
		
		System.out.println("==========frequncies of each name==========");
		Map<String,Long> newEmp=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		newEmp.forEach((key,value)->System.out.println("key: "+key+" value: "+value));
		
		System.out.println("==========Duplicate names==========");
		List<String> dpname=newEmp.entrySet().stream().filter(a->a.getValue()>1).map(b->b.getKey()).collect(Collectors.toList());
		System.out.println("dpnames: "+dpname);
		
		System.out.println("==========duplicate names using frequncy()==========");
		Set<String> dpnames=names.stream().filter(name->Collections.frequency(names, name)>1).collect(Collectors.toSet());
		System.out.println("dpnames: "+dpnames);
		
		
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
