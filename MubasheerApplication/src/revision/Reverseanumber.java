package revision;

public class Reverseanumber {

	public static void main(String[] args) {
		int number=12345,sum=0;
		
		while(number!=0) {
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		
		System.out.println(sum);

	}

}
