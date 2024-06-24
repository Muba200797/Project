package interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpSalDesc {
	public static void main(String[] args) {
		List<Employee4> empList=new ArrayList<Employee4>();
		
		empList.add(new Employee4(1, 1000));
		empList.add(new Employee4(2, 2000));
		empList.add(new Employee4(3, 3000));
		empList.add(new Employee4(4, 4000));
		empList.add(new Employee4(5, 4500));
		empList.add(new Employee4(6, 5000));
		
		List<Employee4> sortedList=empList.stream().sorted((a1,a2)->(int)(a2.getSalary()-a1.getSalary())).collect(Collectors.toList());
		System.out.println("sortedList in desc: "+sortedList);
		
		List<Employee4> partEmp=sortedList.stream().limit(3).collect(Collectors.toList());
		System.out.println("3 Highest salaried employees: "+partEmp);
		
		List<Employee4> partEmplow=sortedList.stream().skip(3).limit(3).collect(Collectors.toList());
		
		System.out.println("3 Lowest salaried employees: "+partEmplow);
		
		
		
		List<Employee4> list1=empList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList());
		
	}
	
	

}
