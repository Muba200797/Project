package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FindbyIDOptional {

	public static void main(String[] args) {
		List<Employee3> newList=new ArrayList<Employee3>();
		newList.add(new Employee3("Mubasheer", 1));
		newList.add(new Employee3("Sadiya", 2));
		Map<Integer, Employee3> newMap=new HashMap<Integer, Employee3>();
		newList.forEach(map->newMap.put(map.getId(), map));
		
		System.out.println("Map: "+newMap);
		
		String employeeName=findbyId(newMap,5);
		System.out.println("EmployeeName: "+employeeName);
		
	}

	private static String findbyId(Map<Integer, Employee3> newMap, int i) {
		// TODO Auto-generated method stub
		//return Optional.ofNullable(newMap.get(i)).map(Employee3::getName).orElse("Not yet generated so, Anonymous");
		
		//Supplier interface
		//return Optional.ofNullable(newMap.get(i)).map(Employee3::getName).orElseGet(()->"Not yet generated so, Anonymous");
		
		//OrElseThrow
		return Optional.ofNullable(newMap.get(i)).map(Employee3::getName).orElseThrow(()->new IllegalArgumentException("Not yet generated so, Anonymous"));
	}

	

}
