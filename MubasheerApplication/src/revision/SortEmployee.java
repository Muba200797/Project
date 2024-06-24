package revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		
		//Using Sorted
		System.out.println("==========using sorted==========");
		List<Employee2> newLis=newList.stream().sorted(Comparator.comparing(Employee2::getName)).collect(Collectors.toList());
		
		newLis.forEach(e->System.out.println("Name: "+e.getName()+" id: "+e.getId()));
		
		//sort
		System.out.println("==========using sort==========");
		newLis.sort(Comparator.comparing(Employee2::getName));
		newLis.forEach(e->System.out.println("Name: "+e.getName()+" id: "+e.getId()));
		
		System.out.println("==========sorting in reverse order==========");
		newLis.sort(Comparator.comparing(Employee2::getName).reversed());
		newLis.forEach(e->System.out.println("Name: "+e.getName()+" id: "+e.getId()));
		
		System.out.println("==========sorting using Grouping BY==========");
		
		Comparator<Employee2> newcom=Comparator.comparing(Employee2::getCity).thenComparing(Employee2::getName);
		newList.sort(newcom);
		newList.forEach(e->System.out.println("Name: "+e.getName()+" id: "+e.getId()));
		
	}
	
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}

}
