package interviewprep;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumMinMaxAvgCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee2> empList=new ArrayList<Employee2>();
		generateEmp(empList);
		
		//find All ages
		List<Integer> ages=empList.stream().map(Employee2::getAge).collect(Collectors.toList());
		System.out.println(ages);
		
		//Find minimum age
		int min=ages.stream().mapToInt(x->x).summaryStatistics().getMin();
		System.out.println(min);
		//Find maximum age
		int max=ages.stream().mapToInt(x->x).summaryStatistics().getMax();
		System.out.println(max);
		//Find Average age
		Double avg=ages.stream().mapToInt(x->x).summaryStatistics().getAverage();
		System.out.println(avg);
		//Find sum of ages
		Long sum=ages.stream().mapToInt(x->x).summaryStatistics().getSum();
		System.out.println(sum);
		//Count
		Long count=ages.stream().mapToInt(x->x).summaryStatistics().getCount();
		System.out.println(count);
		
					//OTHER METHOD
		IntSummaryStatistics summary=ages.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Min Age: "+summary.getMin());
		System.out.println("Max Age: "+summary.getMax());
		System.out.println("Avg Age: "+summary.getAverage());
		System.out.println("Sum of Age: "+summary.getSum());
		System.out.println("Count Age: "+summary.getCount());
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
