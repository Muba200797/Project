package revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SOrtAgeInDesc {
	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		
		System.out.println("=====using comparing=====");
		List<Employee2> newl=newList.stream().sorted(Comparator.comparing(Employee2::getAge).reversed()).collect(Collectors.toList());
		newl.forEach(a->System.out.println(a));
		System.out.println("=====Building comparator based on age =====");
		List<Employee2> newListComp=newList.stream().sorted((a1,a2)->(a2.getAge()-a1.getAge())).collect(Collectors.toList());
		newListComp.forEach(a->System.out.println(a));
		System.out.println("=====3rd highest Age Employees =====");
		List<Employee2> Age=newListComp.stream().limit(3).collect(Collectors.toList());
		System.out.println(Age);
		
		//Find First
		Employee2 firstEmp=newList.stream().filter(a->a.getName().contains("Arun")).findFirst().get();
		
		System.out.println(firstEmp);
		
		boolean anymatch=newList.stream().anyMatch(a->a.getName().contains("Kalyan"));
		System.out.println("Anymatch: "+anymatch);
		
		boolean AllMatch=newList.stream().allMatch(a->a.getName().contains("a"));
		System.out.println("AllMatch: "+AllMatch);
		
		boolean noneMatch=newList.stream().noneMatch(a->a.getName().contains("1"));
		System.out.println("noneMatch: "+noneMatch);
		
	}
	
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Aruna", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Vijaya", "9", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}
}
