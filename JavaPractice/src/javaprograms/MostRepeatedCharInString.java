package javaprograms;

public class MostRepeatedCharInString {
	
	public char getMaxCharInString(String str) {
		char retChar=' ', tempChar=' ';
		int currentCount=0, prevCount=0;
		
		for(int i=0;i<str.length();i++) {
			tempChar=str.charAt(i);
			currentCount=1;
			for(int j=i+1;j<str.length();j++) {
				if(tempChar==str.charAt(j)) {
					currentCount++;
				}
			}
			if(prevCount<currentCount) {
				retChar=tempChar;
				prevCount=currentCount;
			}
		}
		return retChar;
		
	}

	public static void main(String[] args) {
		MostRepeatedCharInString strCount=new MostRepeatedCharInString();
		String str1="Harshani is a bad girl";
		
		System.out.println("The most repeated char in string is :"+strCount.getMaxCharInString(str1));
	}

}
