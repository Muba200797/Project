package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddparametersofList {

	public static void main(String[] args) {
		List<String> oldnames=new ArrayList<String>();
		oldnames.add("Tom");
		oldnames.add("Tom3");
		oldnames.add("Tom5");
		System.out.println(oldnames);
		
		update(oldnames);
		
		System.out.println("Updated list: "+oldnames);
		
		

	}

	private static void update(List<String> oldnames) {
		String[] newnames={"alex2","Tom2","sam2"};
		for(int i=0;i<=newnames.length-1;i++) {
			if(!oldnames.contains(newnames[i])) {
				oldnames.add(i+1,newnames[i]);
			}
		}
		
	}

}
