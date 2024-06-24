package interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCaseandComma {
	public static void main(String[] args) {
		List<Employee2> empList=new ArrayList<Employee2>();
		generateEmp(empList);
		//Fetch all the employee names as string and separate it with delimiter comma
		List<String> empNames=empList.stream().map(Employee2::getName).sorted().collect(Collectors.toList());
		String name=empNames.stream().map(n->n.toUpperCase()).collect(Collectors.joining(",  "));
		System.out.println(name);
		
	}
	
	public static void generateEmp(List<Employee2> empList) {

		Employee2 emp1 = new Employee2("Arun", "1", "Hyderabad",21);
		Employee2 emp2 = new Employee2("Mahesh", "2", "Noida",23);
		Employee2 emp3 = new Employee2("Vijay", "3", "Pune",25);
		Employee2 emp4 = new Employee2("Laxman", "4", "Bangalore",27);
		Employee2 emp5 = new Employee2("Kalyan", "5", "Bangalore",29);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

	}
}
