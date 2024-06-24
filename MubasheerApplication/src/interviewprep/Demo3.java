package interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Demo3 {
	public static void main(String[] args) {
		
		List<Employee3> empList=new ArrayList<Employee3>();
		Employee3 emp1=new Employee3("Ammu", 1);
		Employee3 emp2=new Employee3("Sadiya", 2);
		empList.add(emp1);
		empList.add(emp2);
		
		Map<Integer, Employee3> empMap=new HashMap<Integer, Employee3>();
		
		empList.forEach(emp->empMap.put(emp.getId(), emp));
		System.out.println(empMap);
		
		String availableName=FindEmployeebyId(empMap,2);
		System.out.println("NotavailableName: "+availableName);

	}

	private static String FindEmployeebyId(Map<Integer, Employee3> empMap, int id) {
		
		return Optional.ofNullable(empMap.get(id)).map(Employee3::getName).orElse("Anonymous");
	}
}
