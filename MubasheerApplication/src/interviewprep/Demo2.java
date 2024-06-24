package interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		
		
		List<Employee> empList=new ArrayList<Employee>();
		generateEmp(empList);
		
		//empList.forEach(a->System.out.println(a.getName()+"=="+a.getCity()));
//		empList.sort(Comparator.comparing(Employee::getName));
//		empList.forEach(a->System.out.println(a.getName()+"=="+a.getCity()));
//		empList.sort(Comparator.comparing(Employee::getName).reversed());
//		empList.forEach(a->System.out.println(a.getName()+"=="+a.getCity()));
		
		Comparator<Employee> groupby=Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);
		empList.sort(groupby);
		empList.forEach(e->System.out.println(e.getName()+"--"+e.getCity()));
	}
		// TODO Auto-generated method stu
		public static void generateEmp(List<Employee> empList) {

			Employee emp1 = new Employee("Arun", "1", "Delhi");
			Employee emp2 = new Employee("Mahesh", "2", "Noida");
			Employee emp3 = new Employee("Vijay", "3", "Pune");
			Employee emp4 = new Employee("Laxman", "4", "Bangalore");
			Employee emp5 = new Employee("Kalyan", "5", "Bangalore");
			Employee emp6 = new Employee("Arun2", "1", "Delhi2");

			empList.add(emp1);
			empList.add(emp2);
			empList.add(emp3);
			empList.add(emp4);
			empList.add(emp5);
			empList.add(emp6);
			
	}

}
	
