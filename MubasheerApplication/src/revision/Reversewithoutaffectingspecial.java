package revision;

public class Reversewithoutaffectingspecial {

	public static void main(String[] args) {
		String s="H@ell&o";
		char[] ch=s.toCharArray();
		
		int l=0,r=s.length()-1;
		
		while(l<r) {
			
			if(!Character.isAlphabetic(ch[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(ch[r])) {
				r--;
			}
			else {
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
		}
		System.out.println(ch);

	}

}
