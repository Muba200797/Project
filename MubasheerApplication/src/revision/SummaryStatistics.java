package revision;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SummaryStatistics {

	public static void main(String[] args) {
		List<Employee2> newList=new ArrayList<Employee2>();
		generateEmp(newList);
		
		List<Integer> ages=newList.stream().map(Employee2::getAge).collect(Collectors.toList());
		System.out.println(ages);
		
		IntSummaryStatistics stats=ages.stream().mapToInt(x->x).summaryStatistics();
		int minage=stats.getMin();
		System.out.println(minage);
		int maxage=stats.getMax();
		System.out.println("maxage: "+maxage);
		Double avgage=stats.getAverage();
		System.out.println("avgage: "+avgage);
		int sum=stats.getMin();
		System.out.println("sum: "+sum);
		Long count=stats.getCount();
		System.out.println("count: "+count);
		
		//Slicing
		
		System.out.println("=======slicing========");
		List<Integer> slice=ages.stream().skip(1).limit(3).collect(Collectors.toList());
		System.out.println(slice);
		
		
		//Slicingb employeenames
		System.out.println("=======slicing Names========");
		List<String> names1=newList.stream().map(Employee2::getName).collect(Collectors.toList());
		List<String> sliced=names1.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(sliced);
		
		System.out.println("=======slicing Employees========");
		
		List<Employee2> sle=newList.stream().skip(0).limit(3).collect(Collectors.toList());
		System.out.println(sle);
	}
	
	private static void generateEmp(List<Employee2> newList) {
		newList.add(new Employee2("Arun", "1", "Hyderabad",21));
		newList.add(new Employee2("Mahesh", "2", "Noida",23));
		newList.add(new Employee2("Vijay", "3", "Pune",25));
		newList.add(new Employee2("Laxman", "4", "Bangalore",27));
		newList.add(new Employee2("Kalyan", "5", "Bangalore",29));
		
	}

}
