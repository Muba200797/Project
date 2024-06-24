package revision;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,n=10;
		
		for(int i=0;i<n;i++) {
			System.out.println(b+" ");
			int sum=a+b;
			a=b;
			b=sum;
		}
		

	}

}
