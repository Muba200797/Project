package revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Removeduparray {

	public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Grapes", "Banana"};
        
        
        //Oneway
        String[] unique=Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.stream(unique).forEach(a->System.out.println(a));
        
        //2ndway
        Set<String> u=new HashSet<String>();
        
        List<String> ul=Arrays.asList(arr).stream().filter(n->!u.add(n)).collect(Collectors.toList());
        
        System.out.println(u);

	}

}
