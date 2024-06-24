package revision;

import java.util.stream.IntStream;

public class Numberasperpositionofstring {

	public static void main(String[] args) {
		String ip="Mubasheer";
		String op=IntStream.range(0, ip.length()).mapToObj(a->ip.charAt(a)+""+(a+1)).reduce("", ((a,b)->(a+b)));
		
		
		
		String op1=IntStream.range(0, ip.length()).mapToObj(e->ip.charAt(e)+""+(e+1)).reduce("", (a,b)->(a+b));
		System.out.println(op);
	}

}
