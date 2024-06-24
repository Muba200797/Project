package strings;

public class StringCompression {
	public static void main(String[] args) {
		String s="abbcccdddd";
		int count=1;
		
		StringBuilder compressed=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				compressed.append(s.charAt(i));
				compressed.append(count);
				count=1;
			}
		}
		System.out.println(compressed);
	}
}
