package interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sliced {
	
	public static void main(String[] args) {
		List<Employee2> empList=new ArrayList<Employee2>();
		generateEmp(empList);
		
		//Slicing 2nd and 3rd employee names
		List<String> new1=empList.stream().map(Employee2::getName).skip(1).limit(2).collect(Collectors.toList());
		System.out.println("Sliced Employee names: "+new1);
		
		//Slicing 2nd and 3rd employee objects
		List<Employee2> new2=empList.stream().map(x->x).skip(1).limit(2).collect(Collectors.toList());
		System.out.println("Sliced Employees: "+new2);
		
		//Slicing ages 3rd and 4th
		List<Integer> ages=empList.stream().map(Employee2::getAge).collect(Collectors.toList());
		
		List<Integer> sliced=ages.stream().skip(2).limit(2).collect(Collectors.toList());
		System.out.println("Sliced Employee ages: "+sliced);
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
