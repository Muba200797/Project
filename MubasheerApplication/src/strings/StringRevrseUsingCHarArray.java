package strings;

public class StringRevrseUsingCHarArray {
	public static void main(String[] args) {
		String s="olleh";
		char[] ch=s.toCharArray();
		
		int left=0,right=s.length()-1;
		
		while(left<right) {
			
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		System.out.println(ch);
	}
	

}
