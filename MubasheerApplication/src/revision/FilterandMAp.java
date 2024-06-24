package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterandMAp {

	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		
		List<Employee2> nl=newList.stream().filter(a->a.getCity()=="Bangalore").collect(Collectors.toList());
		System.out.println(nl);
		
		List<String> names=newList.stream().map(Employee2::getName).collect(Collectors.toList());
		names.forEach(a->System.out.println(a));
		
		System.out.println("=========city names as key and value as list oof name of employee======");
		Map<String, List<String>> ss=newList.stream().collect(Collectors.groupingBy(Employee2::getCity,Collectors.mapping(Employee2::getName, Collectors.toList())));
		ss.forEach((key,value)->System.out.println("key: "+key+" value: "+value));
		
		System.out.println("=========Age as key and value as list  of employee======");
		Map<Integer, List<Employee2>> ss1=newList.stream().collect(Collectors.groupingBy(Employee2::getAge));
		ss1.forEach((key,value)->System.out.println("key: "+key+" value: "+value));

	}
	
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}

}
