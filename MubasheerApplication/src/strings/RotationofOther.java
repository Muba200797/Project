package strings;

public class RotationofOther {

	public static void main(String[] args) {
		String s1="waterbottle",s2="erbottlewat";
		String s3=s1+s1;
		
		if (s3.contains(s2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
