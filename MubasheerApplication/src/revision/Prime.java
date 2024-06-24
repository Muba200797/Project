package revision;

public class Prime {

	public static void main(String[] args) {
		int n=11,flag=0;
		if(n==0 || n==1) {
			System.out.println("not a prime");
		}
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag++;
			}
		}
		
		if(flag==0) {
			System.out.println("prime");
		}

	}

}
