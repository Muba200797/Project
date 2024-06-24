package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintnameandIDfromMap {
	public static void main(String[] args) {
		List<Employee3> newList=new ArrayList<Employee3>();
		generateEmp(newList);
		
		List<String> newList2=newList.stream().map(a->a.getId()+""+a.getName()).collect(Collectors.toList());
		System.out.println(newList2);
		
	}
	
	private static void generateEmp(List<Employee3> newList) {
		newList.add(new Employee3("Arun",21));
		newList.add(new Employee3("Mahesh",23));
		newList.add(new Employee3("Vijay",25));
		newList.add(new Employee3("Laxman",27));
		newList.add(new Employee3("Kalyan",29));
		
	}

}
