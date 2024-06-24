package interviewprep;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FetchByIdOptional {

	public static void main(String[] args) {
		Employee3 emp1 = new Employee3("Arun", 1);
		Employee3 emp2 = new Employee3("Mahesh", 2);
		
		List<Employee3> empList=new ArrayList<Employee3>();
		empList.add(emp1);
		empList.add(emp2);
		Map<Integer, Employee3> empMap = new HashMap<Integer, Employee3>();
		
		empList.forEach(emp->empMap.put(emp.getId(), emp));
		System.out.println(empMap);
		
		// Fetch employee by id and return the name using Java 8
        String employeeName = getEmployeeNameById(empMap, 2);
        System.out.println("Employee name: " + employeeName);

        // Test with an employee id that doesn't exist
        String defaultName = getEmployeeNameById(empMap, 3);
        System.out.println("Default name: " + defaultName);
	}

	private static String getEmployeeNameById(Map<Integer, Employee3> empMap, int id) {
		
		 return Optional.ofNullable(empMap.get(id))
	                .map(Employee3::getName)
	                .orElse("Anonymous");
		 
		 //USing Supplier Functional Interface or orElseGet(), so we used lambda expression.
		 //return Optional.ofNullable(empMap.get(id)).map(Employee3::getName).orElseGet(()->"Anonymous");
	}

}
