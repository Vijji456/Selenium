package javaprograms;

public class CountCharAndVowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ccount=0,vcount=0;
		String str1="Beginners Book";
		String str2=str1.replaceAll(" ", "");
		String str=str2.toLowerCase();
		System.out.println(str);
		int len=str.length();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
			}
		System.out.println("Character count in given string is: "+ccount);
		System.out.println("Vowel count in given string is: "+vcount);

	}

}
