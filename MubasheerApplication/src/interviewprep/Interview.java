package interviewprep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

	public static void generateEmp(List<Employee> empList) {

		Employee emp1 = new Employee("Arun", "1", "Hyderabad");
		Employee emp2 = new Employee("Mahesh", "2", "Noida");
		Employee emp3 = new Employee("Vijay", "3", "Pune");
		Employee emp4 = new Employee("Laxman", "4", "Bangalore");
		Employee emp5 = new Employee("Kalyan", "5", "Bangalore");

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		generateEmp(empList);

		Map<String, List<Employee>> empMap= empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		
		empMap.forEach((key,value)->System.out.println("City: "+key+" Employees: "+value));

	}

}
