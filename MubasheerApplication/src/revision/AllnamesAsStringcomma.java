package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AllnamesAsStringcomma {

	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		
		List<String> names=newList.stream().map(Employee2::getName).collect(Collectors.toList());
		String name=names.stream().map(n->n.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("Joined NAme: "+name);
		

	}
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}

}
