package interviewprep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	public static void main(String[] args) {
		List<Employee2> empList=new ArrayList<Employee2>();
		generateEmp(empList);
		
		List<String> names=empList.stream().map(Employee2::getName).collect(Collectors.toList());
		
		Set<String> uniqueNames=new HashSet<String>();
		
		List<String> duplicateNames=names.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toList());
		
		System.out.println("duplicateNames: "+duplicateNames);
		System.out.println("uniqueNames:"+uniqueNames);
	}
	
	public static void generateEmp(List<Employee2> empList) {

		Employee2 emp1 = new Employee2("Arun", "1", "Hyderabad",21);
		Employee2 emp2 = new Employee2("Mahesh", "2", "Noida",23);
		Employee2 emp3 = new Employee2("Vijay", "3", "Pune",25);
		Employee2 emp4 = new Employee2("Laxman", "4", "Bangalore",27);
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
