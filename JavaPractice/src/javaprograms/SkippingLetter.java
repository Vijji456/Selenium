package javaprograms;

public class SkippingLetter {

	public static void main(String[] args) {
		String str="Hello World", str1=" ";
		
		char[] ch=str.toCharArray();
		int len=str.length();
		
		for(int i=0;i<len;i++) {
			
			str1=str1+ch[i];
			i++;
		}
		
		System.out.println(str1);
	}

}
