package revision;

import java.util.Arrays;
import java.util.Iterator;

public class notproductbyitself {
	public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int[] products = getProductExceptCurrent(numbers);
        System.out.println("Product of all elements except current element:"+Arrays.toString(products));
        //System.out.println(Arrays.toString(products));
    }

    public static int[] getProductExceptCurrent(int[] numbers) {
    	int product=Arrays.stream(numbers).reduce(1, (a,b)->(a*b));
    	
    	int[] products=new int[numbers.length];
    	
    	for(int i=0;i<numbers.length;i++) {
    		products[i]=product/numbers[i];
    	}
    	
    	
    	
    	return products;
    }


}
