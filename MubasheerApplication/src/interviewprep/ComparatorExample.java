package interviewprep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void generateEmp(List<Employee> empList) {

		Employee emp1 = new Employee("Arun", "1", "Delhi");
		Employee emp2 = new Employee("Mahesh", "2", "Noida");
		Employee emp3 = new Employee("Vijay", "3", "Pune");
		Employee emp4 = new Employee("Laxman", "4", "Bangalore");
		Employee emp5 = new Employee("Kalyan", "5", "Bangalore");
		Employee emp6 = new Employee("Arun2", "1", "Delhi2");

		empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);

	}
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		generateEmp(empList);
		
		//without using foreach
		System.out.println("Before sorting: "+empList);
		
		//Using ForEach 
		System.out.println("____________ Before Sorting using forEach ________________ ");
		empList.stream().forEach(emp->System.out.println(emp.getName()+"--"+emp.getCity()));
		
		//Sorting Based on Employee Name
		//Using ForEach
		empList.sort(Comparator.comparing(Employee::getName));
		System.out.println("____________ After Sorting ________________ ");
		empList.forEach(e->System.out.println(e.getName()+"--"+e.getCity()));
		
		//Sorting Based on Employee Name in reverse order
		//Using ForEach
		System.out.println("____________ Sorting in reverse order ________________ ");
		empList.sort(Comparator.comparing(Employee::getName).reversed());
		empList.forEach(e->System.out.println(e.getName()+"--"+e.getCity()));
		
		//Sorting Based on Employee City then Employee Name (Group BY)
		System.out.println("____________ Sorting using groupBY ________________ ");
		Comparator<Employee> groupByComparator=Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);
		empList.sort(groupByComparator);
		empList.forEach(a->System.out.println(a.getName()+"--"+a.getCity()));
		
		
	}

}
