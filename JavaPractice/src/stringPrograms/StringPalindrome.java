package stringPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1,str2="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str1=s.nextLine();
	
		int length=str1.length();
		for(int i=length-1;i>=0;i--) {
		str2=str2+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(str2))
		System.out.println("String is a palindrome ");
		else
			System.out.println("String is not a palindrome ");
		s.close();
	}
	

}
