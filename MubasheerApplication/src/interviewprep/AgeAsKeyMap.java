package interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AgeAsKeyMap {
	public static void generateEmps(List<Employee2> empList) {

		Employee2 emp1 = new Employee2("Arun", "1", "Hyderabad", 21);
		Employee2 emp2 = new Employee2("Mahesh", "2", "Noida", 25);
		Employee2 emp3 = new Employee2("Vijay", "3", "Pune", 25);
		Employee2 emp4 = new Employee2("Laxman", "4", "Bangalore", 25);
		Employee2 emp5 = new Employee2("Kalyan", "5", "Bangalore", 29);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
	}
	public static void main(String[] args) {
		List<Employee2> empList = new ArrayList<Employee2>();
		generateEmps(empList);

		Map<Integer, List<Employee2>> empMap = empList.stream().collect(Collectors.groupingBy(Employee2::getAge));
		empMap.forEach((key, value) -> System.out.println("Age: " + key + "::" + " Employees: " + value));
		// If I want to get unique employee i.e, employee name , now i need to override
		// hashcode and equals of EMpNAME
		// Map<Integer, Set<Employee2>> empMap1=empList.stream().collect(Collectors.groupingBy(Employee2::getAge,Collectors.toSet()));
		//If interviewer ASks for sorted map and ask you to not use hashmap
		//Map<Integer, Set<Employee2>> empMap1=empList.stream().collect(Collectors.groupingBy(Employee2::getAge,TreeMap::new,Collectors.toSet()));
		// System.out.println(empMap1);	
		
	
	}

}
