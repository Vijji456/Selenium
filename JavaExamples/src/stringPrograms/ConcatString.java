package stringPrograms;

import java.util.Scanner;

public class ConcatString {

	public static void main(String[] args) {
		String str1,str2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string");
		str1=s.nextLine();
		System.out.println("Enter the string second String");
		str2=s.nextLine();
		s.close();
		str1=str1.concat(str2);
		System.out.println("The whole string is:"+str1);
	}

}
