package revision;

public class Armstrong {

	public static void main(String[] args) {
		int number=371,sum=0;
		int org=number;
		
		while(org!=0) {
			int r=org%10;
			sum=(int) (sum+Math.pow(r, 3));
			org=org/10;
		}
		if(sum==number) {
			System.out.println("Armstrong");
		}
	}

}
