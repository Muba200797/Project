package revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingBy {

	public static void main(String[] args) {
		List<Employee2> newList= new ArrayList<Employee2>();
		
		generateEmp(newList);
		
		Map<String, List<Employee2>> newMap=newList.stream().collect(Collectors.groupingBy(Employee2::getCity));
		
		newMap.forEach((key,value)->System.out.println("key: "+key+" value: "+value));
	}

	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}
}
